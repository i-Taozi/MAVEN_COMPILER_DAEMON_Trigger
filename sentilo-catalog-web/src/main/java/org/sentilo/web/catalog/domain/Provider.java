/*
 * Sentilo
 *
 * Original version 1.4 Copyright (C) 2013 Institut Municipal d’Informàtica, Ajuntament de
 * Barcelona. Modified by Opentrends adding support for multitenant deployments and SaaS.
 * Modifications on version 1.5 Copyright (C) 2015 Opentrends Solucions i Sistemes, S.L.
 *
 *
 * This program is licensed and may be used, modified and redistributed under the terms of the
 * European Public License (EUPL), either version 1.1 or (at your option) any later version as soon
 * as they are approved by the European Commission.
 *
 * Alternatively, you may redistribute and/or modify this program under the terms of the GNU Lesser
 * General Public License as published by the Free Software Foundation; either version 3 of the
 * License, or (at your option) any later version.
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied.
 *
 * See the licenses for the specific language governing permissions, limitations and more details.
 *
 * You should have received a copy of the EUPL1.1 and the LGPLv3 licenses along with this program;
 * if not, you may find them at:
 *
 * https://joinup.ec.europa.eu/software/page/eupl/licence-eupl http://www.gnu.org/licenses/ and
 * https://www.gnu.org/licenses/lgpl.txt
 */
package org.sentilo.web.catalog.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.PositiveOrZero;

import org.sentilo.web.catalog.context.TenantContextHolder;
import org.sentilo.web.catalog.utils.Constants;
import org.sentilo.web.catalog.utils.IdentityKeyGenerator;
import org.sentilo.web.catalog.utils.TenantUtils;
import org.sentilo.web.catalog.validator.ValidEntityId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.util.StringUtils;

@Document
public class Provider implements Entity, FederatedResource, TenantResource, SyncResource, AlphabeticalSortable {

  private static final long serialVersionUID = 1L;

  @Id
  @NotBlank
  @ValidEntityId(regexp = Constants.VALIDATION_ENTITY_NAME_REGEXP)
  private String id;

  private String name;

  private String token;

  private String description;

  @DateTimeFormat(pattern = Constants.DATETIME_FORMAT)
  private Date createdAt;

  private String createdBy;

  @DateTimeFormat(pattern = Constants.DATETIME_FORMAT)
  private Date updatedAt;

  private String updatedBy;

  private List<Sensor> sensors;

  @Valid
  private Contact contact;

  /** Show if API's requests from this provider must be secured over HTTPs */
  private boolean restHttps;

  @PositiveOrZero
  private int apiInputQuota;

  @PositiveOrZero
  private int apiOutputQuota;

  private Boolean federatedResource = Boolean.FALSE;

  private String federatedServiceId;

  private String tenantId;

  private Set<String> tenantsAuth;

  private Set<String> tenantsListVisible;

  public Provider() {
    tenantsAuth = new HashSet<String>();
    tenantsListVisible = new HashSet<String>();
  }

  public Provider(final String id) {
    this();
    this.id = id;
  }

  @Override
  public boolean equals(final Object obj) {
    if (!(obj instanceof Provider) || id == null) {
      return false;
    }
    final Provider other = (Provider) obj;
    return id.equals(other.id);
  }

  @Override
  public int hashCode() {
    // Hashcode return must be consistent with the equals method
    final int prime = 43;
    int result = 1;
    result = prime * result + (id == null ? 0 : id.hashCode());
    return result;
  }

  public void setDefaultValues() {
    if (!StringUtils.hasText(getName())) {
      setName(getId());
    }

    // In a multitenant instance, to allow different tenants to have entities with the same id,
    // the proposed entity id filled in by user is modified by prepending the tenant id
    if (TenantContextHolder.isEnabled()) {
      final String newId = TenantUtils.buildResourceIdWithTenant(getTenantId(), getId());
      setId(newId);
    }

    setToken(IdentityKeyGenerator.generateNewToken(getId()));
  }

  @Override
  public String getId() {
    return id;
  }

  public void setId(final String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(final String name) {
    this.name = name;
  }

  @Override
  public Date getCreatedAt() {
    return createdAt;
  }

  @Override
  public void setCreatedAt(final Date createdAt) {
    this.createdAt = createdAt;
  }

  public List<Sensor> getSensors() {
    return sensors;
  }

  public void setSensors(final List<Sensor> sensors) {
    this.sensors = sensors;
  }

  public String getToken() {
    return token;
  }

  public void setToken(final String token) {
    this.token = token;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(final String description) {
    this.description = description;
  }

  public Contact getContact() {
    return contact;
  }

  public void setContact(final Contact contact) {
    this.contact = contact;
  }

  @Override
  public void setUpdatedAt(final Date updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override
  public Date getUpdatedAt() {
    return updatedAt;
  }

  @Override
  public String getTenantId() {
    return tenantId;
  }

  @Override
  public void setTenantId(final String tenantId) {
    this.tenantId = tenantId;
  }

  @Override
  public Set<String> getTenantsAuth() {
    return tenantsAuth;
  }

  @Override
  public void setTenantsAuth(final Set<String> tenantsAuth) {
    this.tenantsAuth = tenantsAuth;
  }

  @Override
  public Set<String> getTenantsListVisible() {
    return tenantsListVisible;
  }

  @Override
  public void setTenantsListVisible(final Set<String> tenantsListVisible) {
    this.tenantsListVisible = tenantsListVisible;
  }

  @Override
  public String getCreatedBy() {
    return createdBy;
  }

  @Override
  public void setCreatedBy(final String createdBy) {
    this.createdBy = createdBy;
  }

  @Override
  public String getUpdatedBy() {
    return updatedBy;
  }

  @Override
  public void setUpdatedBy(final String updatedBy) {
    this.updatedBy = updatedBy;
  }

  public boolean isRestHttps() {
    return restHttps;
  }

  public void setRestHttps(final boolean restHttps) {
    this.restHttps = restHttps;
  }

  @Override
  public String getSortableValue() {
    return name;
  }

  public void setFederatedResource(final Boolean federatedResource) {
    this.federatedResource = federatedResource;
  }

  public String getFederatedServiceId() {
    return federatedServiceId;
  }

  public void setFederatedServiceId(final String federatedServiceId) {
    this.federatedServiceId = federatedServiceId;
  }

  @Override
  public Boolean getFederatedResource() {
    return federatedResource;
  }

  public int getApiInputQuota() {
    return apiInputQuota;
  }

  public void setApiInputQuota(final int apiInputQuota) {
    this.apiInputQuota = apiInputQuota;
  }

  public int getApiOutputQuota() {
    return apiOutputQuota;
  }

  public void setApiOutputQuota(final int apiOutputQuota) {
    this.apiOutputQuota = apiOutputQuota;
  }
}
