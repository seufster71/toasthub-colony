package org.toasthub.colony.model;

import java.io.Serializable;
import java.time.Instant;
import java.util.List;

import org.toasthub.core.general.model.BaseEntity;


public class Frame extends BaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	
	protected String frameId;
	protected Instant installDate;
	protected String condition;
	protected String containsBrood;
	protected String containsCappedHoney;
	protected String containsWaxMoth;
	
	protected String combPercentComplete;
	protected String overallStatus;

	protected List<Inspection> inspections;
	protected List<Note> notes;
	protected List<History> histories;
	
	// Constructor
	public Frame(){}
	

	// Methods

	
}
