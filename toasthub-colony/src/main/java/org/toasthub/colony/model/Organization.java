/*
 * Copyright (C) 2023 The ToastHub Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * @author Edward H. Seufert
 */

package org.toasthub.colony.model;

import java.time.Instant;

import org.toasthub.core.general.api.View;
import org.toasthub.core.general.model.BaseEntity;

import com.fasterxml.jackson.annotation.JsonView;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "cc_organization")
public class Organization extends BaseEntity {

	private static final long serialVersionUID = 1L;

	protected String identifier = "";
	protected String name = "";
	protected String status = "";
	protected String statusMessage = "";
	protected Long userId;

	// Constructors
	public Organization() {
		super();
		this.setActive(true);
		this.setArchive(false);
		this.setLocked(false);
		this.setCreated(Instant.now());
	}

	public Organization(final String code, final Boolean defaultLang, final String dir) {
		super();
		this.setActive(true);
		this.setArchive(false);
		this.setLocked(false);
		this.setCreated(Instant.now());
	}

	// Setter/Getter


	@JsonView({ View.Member.class })
	@Column(name = "identifier")
	public String getIdentifier() {
		return identifier;
	}
	public void setIdentifier(final String identifier) {
		this.identifier = identifier;
	}

	@JsonView({ View.Member.class })
	@Column(name = "status")
	public String getStatus() {
		return status;
	}
	public void setStatus(final String status) {
		this.status = status;
	}

	@JsonView({ View.Member.class })
	@Column(name = "name")
	public String getName() {
		return name;
	}
	public void setName(final String name) {
		this.name = name;
	}

	@JsonView({ View.Member.class })
	@Column(name = "status_message")
	public String getStatusMessage() {
		return statusMessage;
	}
	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}
	
	@JsonView({ View.Member.class })
	@Column(name = "user_id")
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
}
