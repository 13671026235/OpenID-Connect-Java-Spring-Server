/*******************************************************************************
 * Copyright 2014 The MITRE Corporation
 *   and the MIT Kerberos and Internet Trust Consortium
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/

package org.mitre.oauth2.model;

import java.util.Date;
import java.util.Map;
import java.util.Set;

import org.mitre.jose.JWEAlgorithmEmbed;
import org.mitre.jose.JWEEncryptionMethodEmbed;
import org.mitre.jose.JWSAlgorithmEmbed;
import org.mitre.oauth2.model.ClientDetailsEntity.AppType;
import org.mitre.oauth2.model.ClientDetailsEntity.AuthMethod;
import org.mitre.oauth2.model.ClientDetailsEntity.SubjectType;
import org.springframework.security.core.GrantedAuthority;

import com.nimbusds.jose.EncryptionMethod;
import com.nimbusds.jose.JWEAlgorithm;
import com.nimbusds.jose.JWSAlgorithm;

/**
 * @author jricher
 *
 */
public interface RegisteredClient {

	/**
	 * @return the client
	 */
	ClientDetailsEntity getClient();

	/**
	 * @param client the client to set
	 */
	void setClient(ClientDetailsEntity client);

	/**
	 * @return
	 * @see org.mitre.oauth2.model.ClientDetailsEntity#getClientDescription()
	 */
	String getClientDescription();

	/**
	 * @param clientDescription
	 * @see org.mitre.oauth2.model.ClientDetailsEntity#setClientDescription(java.lang.String)
	 */
	void setClientDescription(String clientDescription);

	/**
	 * @return
	 * @see org.mitre.oauth2.model.ClientDetailsEntity#isAllowRefresh()
	 */
	boolean isAllowRefresh();

	/**
	 * @return
	 * @see org.mitre.oauth2.model.ClientDetailsEntity#isReuseRefreshToken()
	 */
	boolean isReuseRefreshToken();

	/**
	 * @param reuseRefreshToken
	 * @see org.mitre.oauth2.model.ClientDetailsEntity#setReuseRefreshToken(boolean)
	 */
	void setReuseRefreshToken(boolean reuseRefreshToken);

	/**
	 * @return
	 * @see org.mitre.oauth2.model.ClientDetailsEntity#getIdTokenValiditySeconds()
	 */
	Integer getIdTokenValiditySeconds();

	/**
	 * @param idTokenValiditySeconds
	 * @see org.mitre.oauth2.model.ClientDetailsEntity#setIdTokenValiditySeconds(java.lang.Integer)
	 */
	void setIdTokenValiditySeconds(Integer idTokenValiditySeconds);

	/**
	 * @return
	 * @see org.mitre.oauth2.model.ClientDetailsEntity#isDynamicallyRegistered()
	 */
	boolean isDynamicallyRegistered();

	/**
	 * @param dynamicallyRegistered
	 * @see org.mitre.oauth2.model.ClientDetailsEntity#setDynamicallyRegistered(boolean)
	 */
	void setDynamicallyRegistered(boolean dynamicallyRegistered);

	/**
	 * @return
	 * @see org.mitre.oauth2.model.ClientDetailsEntity#isAllowIntrospection()
	 */
	boolean isAllowIntrospection();

	/**
	 * @param allowIntrospection
	 * @see org.mitre.oauth2.model.ClientDetailsEntity#setAllowIntrospection(boolean)
	 */
	void setAllowIntrospection(boolean allowIntrospection);

	/**
	 * @return
	 * @see org.mitre.oauth2.model.ClientDetailsEntity#isSecretRequired()
	 */
	boolean isSecretRequired();

	/**
	 * @return
	 * @see org.mitre.oauth2.model.ClientDetailsEntity#isScoped()
	 */
	boolean isScoped();

	/**
	 * @return
	 * @see org.mitre.oauth2.model.ClientDetailsEntity#getClientId()
	 */
	String getClientId();

	/**
	 * @param clientId
	 * @see org.mitre.oauth2.model.ClientDetailsEntity#setClientId(java.lang.String)
	 */
	void setClientId(String clientId);

	/**
	 * @return
	 * @see org.mitre.oauth2.model.ClientDetailsEntity#getClientSecret()
	 */
	String getClientSecret();

	/**
	 * @param clientSecret
	 * @see org.mitre.oauth2.model.ClientDetailsEntity#setClientSecret(java.lang.String)
	 */
	void setClientSecret(String clientSecret);

	/**
	 * @return
	 * @see org.mitre.oauth2.model.ClientDetailsEntity#getScope()
	 */
	Set<String> getScope();

	/**
	 * @param scope
	 * @see org.mitre.oauth2.model.ClientDetailsEntity#setScope(java.util.Set)
	 */
	void setScope(Set<String> scope);

	/**
	 * @return
	 * @see org.mitre.oauth2.model.ClientDetailsEntity#getGrantTypes()
	 */
	Set<String> getGrantTypes();

	/**
	 * @param grantTypes
	 * @see org.mitre.oauth2.model.ClientDetailsEntity#setGrantTypes(java.util.Set)
	 */
	void setGrantTypes(Set<String> grantTypes);

	/**
	 * @return
	 * @see org.mitre.oauth2.model.ClientDetailsEntity#getAuthorizedGrantTypes()
	 */
	Set<String> getAuthorizedGrantTypes();

	/**
	 * @return
	 * @see org.mitre.oauth2.model.ClientDetailsEntity#getAuthorities()
	 */
	Set<GrantedAuthority> getAuthorities();

	/**
	 * @param authorities
	 * @see org.mitre.oauth2.model.ClientDetailsEntity#setAuthorities(java.util.Set)
	 */
	void setAuthorities(Set<GrantedAuthority> authorities);

	/**
	 * @return
	 * @see org.mitre.oauth2.model.ClientDetailsEntity#getAccessTokenValiditySeconds()
	 */
	Integer getAccessTokenValiditySeconds();

	/**
	 * @param accessTokenValiditySeconds
	 * @see org.mitre.oauth2.model.ClientDetailsEntity#setAccessTokenValiditySeconds(java.lang.Integer)
	 */
	void setAccessTokenValiditySeconds(Integer accessTokenValiditySeconds);

	/**
	 * @return
	 * @see org.mitre.oauth2.model.ClientDetailsEntity#getRefreshTokenValiditySeconds()
	 */
	Integer getRefreshTokenValiditySeconds();

	/**
	 * @param refreshTokenValiditySeconds
	 * @see org.mitre.oauth2.model.ClientDetailsEntity#setRefreshTokenValiditySeconds(java.lang.Integer)
	 */
	void setRefreshTokenValiditySeconds(Integer refreshTokenValiditySeconds);

	/**
	 * @return
	 * @see org.mitre.oauth2.model.ClientDetailsEntity#getRedirectUris()
	 */
	Set<String> getRedirectUris();

	/**
	 * @param redirectUris
	 * @see org.mitre.oauth2.model.ClientDetailsEntity#setRedirectUris(java.util.Set)
	 */
	void setRedirectUris(Set<String> redirectUris);

	/**
	 * @return
	 * @see org.mitre.oauth2.model.ClientDetailsEntity#getRegisteredRedirectUri()
	 */
	Set<String> getRegisteredRedirectUri();

	/**
	 * @return
	 * @see org.mitre.oauth2.model.ClientDetailsEntity#getResourceIds()
	 */
	Set<String> getResourceIds();

	/**
	 * @param resourceIds
	 * @see org.mitre.oauth2.model.ClientDetailsEntity#setResourceIds(java.util.Set)
	 */
	void setResourceIds(Set<String> resourceIds);

	/**
	 * @return
	 * @see org.mitre.oauth2.model.ClientDetailsEntity#getAdditionalInformation()
	 */
	Map<String, Object> getAdditionalInformation();

	/**
	 * @return
	 * @see org.mitre.oauth2.model.ClientDetailsEntity#getApplicationType()
	 */
	AppType getApplicationType();

	/**
	 * @param applicationType
	 * @see org.mitre.oauth2.model.ClientDetailsEntity#setApplicationType(org.mitre.oauth2.model.ClientDetailsEntity.AppType)
	 */
	void setApplicationType(AppType applicationType);

	/**
	 * @return
	 * @see org.mitre.oauth2.model.ClientDetailsEntity#getClientName()
	 */
	String getClientName();

	/**
	 * @param clientName
	 * @see org.mitre.oauth2.model.ClientDetailsEntity#setClientName(java.lang.String)
	 */
	void setClientName(String clientName);

	/**
	 * @return
	 * @see org.mitre.oauth2.model.ClientDetailsEntity#getTokenEndpointAuthMethod()
	 */
	AuthMethod getTokenEndpointAuthMethod();

	/**
	 * @param tokenEndpointAuthMethod
	 * @see org.mitre.oauth2.model.ClientDetailsEntity#setTokenEndpointAuthMethod(org.mitre.oauth2.model.ClientDetailsEntity.AuthMethod)
	 */
	void setTokenEndpointAuthMethod(AuthMethod tokenEndpointAuthMethod);

	/**
	 * @return
	 * @see org.mitre.oauth2.model.ClientDetailsEntity#getSubjectType()
	 */
	SubjectType getSubjectType();

	/**
	 * @param subjectType
	 * @see org.mitre.oauth2.model.ClientDetailsEntity#setSubjectType(org.mitre.oauth2.model.ClientDetailsEntity.SubjectType)
	 */
	void setSubjectType(SubjectType subjectType);

	/**
	 * @return
	 * @see org.mitre.oauth2.model.ClientDetailsEntity#getContacts()
	 */
	Set<String> getContacts();

	/**
	 * @param contacts
	 * @see org.mitre.oauth2.model.ClientDetailsEntity#setContacts(java.util.Set)
	 */
	void setContacts(Set<String> contacts);

	/**
	 * @return
	 * @see org.mitre.oauth2.model.ClientDetailsEntity#getLogoUri()
	 */
	String getLogoUri();

	/**
	 * @param logoUri
	 * @see org.mitre.oauth2.model.ClientDetailsEntity#setLogoUri(java.lang.String)
	 */
	void setLogoUri(String logoUri);

	/**
	 * @return
	 * @see org.mitre.oauth2.model.ClientDetailsEntity#getPolicyUri()
	 */
	String getPolicyUri();

	/**
	 * @param policyUri
	 * @see org.mitre.oauth2.model.ClientDetailsEntity#setPolicyUri(java.lang.String)
	 */
	void setPolicyUri(String policyUri);

	/**
	 * @return
	 * @see org.mitre.oauth2.model.ClientDetailsEntity#getClientUri()
	 */
	String getClientUri();

	/**
	 * @param clientUri
	 * @see org.mitre.oauth2.model.ClientDetailsEntity#setClientUri(java.lang.String)
	 */
	void setClientUri(String clientUri);

	/**
	 * @return
	 * @see org.mitre.oauth2.model.ClientDetailsEntity#getTosUri()
	 */
	String getTosUri();

	/**
	 * @param tosUri
	 * @see org.mitre.oauth2.model.ClientDetailsEntity#setTosUri(java.lang.String)
	 */
	void setTosUri(String tosUri);

	/**
	 * @return
	 * @see org.mitre.oauth2.model.ClientDetailsEntity#getJwksUri()
	 */
	String getJwksUri();

	/**
	 * @param jwksUri
	 * @see org.mitre.oauth2.model.ClientDetailsEntity#setJwksUri(java.lang.String)
	 */
	void setJwksUri(String jwksUri);

	/**
	 * @return
	 * @see org.mitre.oauth2.model.ClientDetailsEntity#getSectorIdentifierUri()
	 */
	String getSectorIdentifierUri();

	/**
	 * @param sectorIdentifierUri
	 * @see org.mitre.oauth2.model.ClientDetailsEntity#setSectorIdentifierUri(java.lang.String)
	 */
	void setSectorIdentifierUri(String sectorIdentifierUri);

	/**
	 * @return
	 * @see org.mitre.oauth2.model.ClientDetailsEntity#getDefaultMaxAge()
	 */
	Integer getDefaultMaxAge();

	/**
	 * @param defaultMaxAge
	 * @see org.mitre.oauth2.model.ClientDetailsEntity#setDefaultMaxAge(java.lang.Integer)
	 */
	void setDefaultMaxAge(Integer defaultMaxAge);

	/**
	 * @return
	 * @see org.mitre.oauth2.model.ClientDetailsEntity#getRequireAuthTime()
	 */
	Boolean getRequireAuthTime();

	/**
	 * @param requireAuthTime
	 * @see org.mitre.oauth2.model.ClientDetailsEntity#setRequireAuthTime(java.lang.Boolean)
	 */
	void setRequireAuthTime(Boolean requireAuthTime);

	/**
	 * @return
	 * @see org.mitre.oauth2.model.ClientDetailsEntity#getResponseTypes()
	 */
	Set<String> getResponseTypes();

	/**
	 * @param responseTypes
	 * @see org.mitre.oauth2.model.ClientDetailsEntity#setResponseTypes(java.util.Set)
	 */
	void setResponseTypes(Set<String> responseTypes);

	/**
	 * @return
	 * @see org.mitre.oauth2.model.ClientDetailsEntity#getDefaultACRvalues()
	 */
	Set<String> getDefaultACRvalues();

	/**
	 * @param defaultACRvalues
	 * @see org.mitre.oauth2.model.ClientDetailsEntity#setDefaultACRvalues(java.util.Set)
	 */
	void setDefaultACRvalues(Set<String> defaultACRvalues);

	/**
	 * @return
	 * @see org.mitre.oauth2.model.ClientDetailsEntity#getInitiateLoginUri()
	 */
	String getInitiateLoginUri();

	/**
	 * @param initiateLoginUri
	 * @see org.mitre.oauth2.model.ClientDetailsEntity#setInitiateLoginUri(java.lang.String)
	 */
	void setInitiateLoginUri(String initiateLoginUri);

	/**
	 * @return
	 * @see org.mitre.oauth2.model.ClientDetailsEntity#getPostLogoutRedirectUri()
	 */
	String getPostLogoutRedirectUri();

	/**
	 * @param postLogoutRedirectUri
	 * @see org.mitre.oauth2.model.ClientDetailsEntity#setPostLogoutRedirectUri(java.lang.String)
	 */
	void setPostLogoutRedirectUri(String postLogoutRedirectUri);

	/**
	 * @return
	 * @see org.mitre.oauth2.model.ClientDetailsEntity#getRequestUris()
	 */
	Set<String> getRequestUris();

	/**
	 * @param requestUris
	 * @see org.mitre.oauth2.model.ClientDetailsEntity#setRequestUris(java.util.Set)
	 */
	void setRequestUris(Set<String> requestUris);

	/**
	 * @return
	 * @see org.mitre.oauth2.model.ClientDetailsEntity#getRequestObjectSigningAlgEmbed()
	 */
	JWSAlgorithmEmbed getRequestObjectSigningAlgEmbed();

	/**
	 * @param requestObjectSigningAlg
	 * @see org.mitre.oauth2.model.ClientDetailsEntity#setRequestObjectSigningAlgEmbed(org.mitre.jose.JWSAlgorithmEmbed)
	 */
	void setRequestObjectSigningAlgEmbed(
			JWSAlgorithmEmbed requestObjectSigningAlg);

	/**
	 * @return
	 * @see org.mitre.oauth2.model.ClientDetailsEntity#getUserInfoSignedResponseAlgEmbed()
	 */
	JWSAlgorithmEmbed getUserInfoSignedResponseAlgEmbed();

	/**
	 * @param userInfoSignedResponseAlg
	 * @see org.mitre.oauth2.model.ClientDetailsEntity#setUserInfoSignedResponseAlgEmbed(org.mitre.jose.JWSAlgorithmEmbed)
	 */
	void setUserInfoSignedResponseAlgEmbed(
			JWSAlgorithmEmbed userInfoSignedResponseAlg);

	/**
	 * @return
	 * @see org.mitre.oauth2.model.ClientDetailsEntity#getUserInfoEncryptedResponseAlgEmbed()
	 */
	JWEAlgorithmEmbed getUserInfoEncryptedResponseAlgEmbed();

	/**
	 * @param userInfoEncryptedResponseAlg
	 * @see org.mitre.oauth2.model.ClientDetailsEntity#setUserInfoEncryptedResponseAlgEmbed(org.mitre.jose.JWEAlgorithmEmbed)
	 */
	void setUserInfoEncryptedResponseAlgEmbed(
			JWEAlgorithmEmbed userInfoEncryptedResponseAlg);

	/**
	 * @return
	 * @see org.mitre.oauth2.model.ClientDetailsEntity#getUserInfoEncryptedResponseEncEmbed()
	 */
	JWEEncryptionMethodEmbed getUserInfoEncryptedResponseEncEmbed();

	/**
	 * @param userInfoEncryptedResponseEnc
	 * @see org.mitre.oauth2.model.ClientDetailsEntity#setUserInfoEncryptedResponseEncEmbed(org.mitre.jose.JWEEncryptionMethodEmbed)
	 */
	void setUserInfoEncryptedResponseEncEmbed(
			JWEEncryptionMethodEmbed userInfoEncryptedResponseEnc);

	/**
	 * @return
	 * @see org.mitre.oauth2.model.ClientDetailsEntity#getIdTokenSignedResponseAlgEmbed()
	 */
	JWSAlgorithmEmbed getIdTokenSignedResponseAlgEmbed();

	/**
	 * @param idTokenSignedResponseAlg
	 * @see org.mitre.oauth2.model.ClientDetailsEntity#setIdTokenSignedResponseAlgEmbed(org.mitre.jose.JWSAlgorithmEmbed)
	 */
	void setIdTokenSignedResponseAlgEmbed(
			JWSAlgorithmEmbed idTokenSignedResponseAlg);

	/**
	 * @return
	 * @see org.mitre.oauth2.model.ClientDetailsEntity#getIdTokenEncryptedResponseAlgEmbed()
	 */
	JWEAlgorithmEmbed getIdTokenEncryptedResponseAlgEmbed();

	/**
	 * @param idTokenEncryptedResponseAlg
	 * @see org.mitre.oauth2.model.ClientDetailsEntity#setIdTokenEncryptedResponseAlgEmbed(org.mitre.jose.JWEAlgorithmEmbed)
	 */
	void setIdTokenEncryptedResponseAlgEmbed(
			JWEAlgorithmEmbed idTokenEncryptedResponseAlg);

	/**
	 * @return
	 * @see org.mitre.oauth2.model.ClientDetailsEntity#getIdTokenEncryptedResponseEncEmbed()
	 */
	JWEEncryptionMethodEmbed getIdTokenEncryptedResponseEncEmbed();

	/**
	 * @param idTokenEncryptedResponseEnc
	 * @see org.mitre.oauth2.model.ClientDetailsEntity#setIdTokenEncryptedResponseEncEmbed(org.mitre.jose.JWEEncryptionMethodEmbed)
	 */
	void setIdTokenEncryptedResponseEncEmbed(
			JWEEncryptionMethodEmbed idTokenEncryptedResponseEnc);

	/**
	 * @return
	 * @see org.mitre.oauth2.model.ClientDetailsEntity#getRequestObjectSigningAlg()
	 */
	JWSAlgorithm getRequestObjectSigningAlg();

	/**
	 * @param requestObjectSigningAlg
	 * @see org.mitre.oauth2.model.ClientDetailsEntity#setRequestObjectSigningAlg(com.nimbusds.jose.JWSAlgorithm)
	 */
	void setRequestObjectSigningAlg(JWSAlgorithm requestObjectSigningAlg);

	/**
	 * @return
	 * @see org.mitre.oauth2.model.ClientDetailsEntity#getUserInfoSignedResponseAlg()
	 */
	JWSAlgorithm getUserInfoSignedResponseAlg();

	/**
	 * @param userInfoSignedResponseAlg
	 * @see org.mitre.oauth2.model.ClientDetailsEntity#setUserInfoSignedResponseAlg(com.nimbusds.jose.JWSAlgorithm)
	 */
	void setUserInfoSignedResponseAlg(JWSAlgorithm userInfoSignedResponseAlg);

	/**
	 * @return
	 * @see org.mitre.oauth2.model.ClientDetailsEntity#getUserInfoEncryptedResponseAlg()
	 */
	JWEAlgorithm getUserInfoEncryptedResponseAlg();

	/**
	 * @param userInfoEncryptedResponseAlg
	 * @see org.mitre.oauth2.model.ClientDetailsEntity#setUserInfoEncryptedResponseAlg(com.nimbusds.jose.JWEAlgorithm)
	 */
	void setUserInfoEncryptedResponseAlg(
			JWEAlgorithm userInfoEncryptedResponseAlg);

	/**
	 * @return
	 * @see org.mitre.oauth2.model.ClientDetailsEntity#getUserInfoEncryptedResponseEnc()
	 */
	EncryptionMethod getUserInfoEncryptedResponseEnc();

	/**
	 * @param userInfoEncryptedResponseEnc
	 * @see org.mitre.oauth2.model.ClientDetailsEntity#setUserInfoEncryptedResponseEnc(com.nimbusds.jose.EncryptionMethod)
	 */
	void setUserInfoEncryptedResponseEnc(
			EncryptionMethod userInfoEncryptedResponseEnc);

	/**
	 * @return
	 * @see org.mitre.oauth2.model.ClientDetailsEntity#getIdTokenSignedResponseAlg()
	 */
	JWSAlgorithm getIdTokenSignedResponseAlg();

	/**
	 * @param idTokenSignedResponseAlg
	 * @see org.mitre.oauth2.model.ClientDetailsEntity#setIdTokenSignedResponseAlg(com.nimbusds.jose.JWSAlgorithm)
	 */
	void setIdTokenSignedResponseAlg(JWSAlgorithm idTokenSignedResponseAlg);

	/**
	 * @return
	 * @see org.mitre.oauth2.model.ClientDetailsEntity#getIdTokenEncryptedResponseAlg()
	 */
	JWEAlgorithm getIdTokenEncryptedResponseAlg();

	/**
	 * @param idTokenEncryptedResponseAlg
	 * @see org.mitre.oauth2.model.ClientDetailsEntity#setIdTokenEncryptedResponseAlg(com.nimbusds.jose.JWEAlgorithm)
	 */
	void setIdTokenEncryptedResponseAlg(JWEAlgorithm idTokenEncryptedResponseAlg);

	/**
	 * @return
	 * @see org.mitre.oauth2.model.ClientDetailsEntity#getIdTokenEncryptedResponseEnc()
	 */
	EncryptionMethod getIdTokenEncryptedResponseEnc();

	/**
	 * @param idTokenEncryptedResponseEnc
	 * @see org.mitre.oauth2.model.ClientDetailsEntity#setIdTokenEncryptedResponseEnc(com.nimbusds.jose.EncryptionMethod)
	 */
	void setIdTokenEncryptedResponseEnc(
			EncryptionMethod idTokenEncryptedResponseEnc);

	/**
	 * @return
	 * @see org.mitre.oauth2.model.ClientDetailsEntity#getTokenEndpointAuthSigningAlgEmbed()
	 */
	JWSAlgorithmEmbed getTokenEndpointAuthSigningAlgEmbed();

	/**
	 * @param tokenEndpointAuthSigningAlgEmbed
	 * @see org.mitre.oauth2.model.ClientDetailsEntity#setTokenEndpointAuthSigningAlgEmbed(org.mitre.jose.JWSAlgorithmEmbed)
	 */
	void setTokenEndpointAuthSigningAlgEmbed(
			JWSAlgorithmEmbed tokenEndpointAuthSigningAlgEmbed);

	/**
	 * @return
	 * @see org.mitre.oauth2.model.ClientDetailsEntity#getTokenEndpointAuthSigningAlg()
	 */
	JWSAlgorithm getTokenEndpointAuthSigningAlg();

	/**
	 * @param tokenEndpointAuthSigningAlg
	 * @see org.mitre.oauth2.model.ClientDetailsEntity#setTokenEndpointAuthSigningAlg(com.nimbusds.jose.JWSAlgorithm)
	 */
	void setTokenEndpointAuthSigningAlg(JWSAlgorithm tokenEndpointAuthSigningAlg);

	/**
	 * @return
	 * @see org.mitre.oauth2.model.ClientDetailsEntity#getCreatedAt()
	 */
	Date getCreatedAt();

	/**
	 * @param createdAt
	 * @see org.mitre.oauth2.model.ClientDetailsEntity#setCreatedAt(java.util.Date)
	 */
	void setCreatedAt(Date createdAt);

	/**
	 * @return the registrationAccessToken
	 */
	String getRegistrationAccessToken();

	/**
	 * @param registrationAccessToken the registrationAccessToken to set
	 */
	void setRegistrationAccessToken(String registrationAccessToken);

	/**
	 * @return the registrationClientUri
	 */
	String getRegistrationClientUri();

	/**
	 * @param registrationClientUri the registrationClientUri to set
	 */
	void setRegistrationClientUri(String registrationClientUri);

	/**
	 * @return the clientSecretExpiresAt
	 */
	Date getClientSecretExpiresAt();

	/**
	 * @param clientSecretExpiresAt the clientSecretExpiresAt to set
	 */
	void setClientSecretExpiresAt(Date expiresAt);

	/**
	 * @return the clientIdIssuedAt
	 */
	Date getClientIdIssuedAt();

	/**
	 * @param clientIdIssuedAt the clientIdIssuedAt to set
	 */
	void setClientIdIssuedAt(Date issuedAt);

}
