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

import java.math.BigDecimal;
import java.time.Instant;

import org.toasthub.core.general.api.View;
import org.toasthub.core.general.model.BaseEntity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonView;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "cc_hive_sensor_data")
public class HiveSensorData extends BaseEntity {

	private static final long serialVersionUID = 1L;

	protected Integer epochSeconds;
	protected String evaluationPeriod = "";
	protected Integer evaluationDuration;
	protected BigDecimal value;
	
	protected HiveSensor hiveSensor;

	// Constructors
	public HiveSensorData() {
		super();
		this.setActive(true);
		this.setArchive(false);
		this.setLocked(false);
		this.setCreated(Instant.now());
	}

	public HiveSensorData(final String code, final Boolean defaultLang, final String dir) {
		super();
		this.setActive(true);
		this.setArchive(false);
		this.setLocked(false);
		this.setCreated(Instant.now());
	}

	// Setter/Getter


	@JsonView({ View.Member.class })
	@Column(name = "epoch_seconds")
	public Integer getEpochSeconds() {
		return epochSeconds;
	}
	public void setEpochSeconds(final Integer epochSeconds) {
		this.epochSeconds = epochSeconds;
	}

	@JsonView({ View.Member.class })
	@Column(name = "evaluation_period")
	public String getEvaluationPeriod() {
		return evaluationPeriod;
	}
	public void setEvaluationPeriod(final String evaluationPeriod) {
		this.evaluationPeriod = evaluationPeriod;
	}

	@JsonView({ View.Member.class })
	@Column(name = "evaluation_duration")
	public Integer getEvaluationDuration() {
		return evaluationDuration;
	}
	public void setEvaluationDuration(final Integer evaluationDuration) {
		this.evaluationDuration = evaluationDuration;
	}

	@JsonView({ View.Member.class })
	@Column(name = "value")
	public BigDecimal getValue() {
		return value;
	}
	public void setValue(BigDecimal value) {
		this.value = value;
	}

	@JsonIgnore
    @ManyToOne(targetEntity = HiveSensor.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "hive_sensor_id")
	public HiveSensor getHiveSensor() {
		return hiveSensor;
	}
	public void setHiveSensor(HiveSensor hiveSensor) {
		this.hiveSensor = hiveSensor;
	}

	
}
