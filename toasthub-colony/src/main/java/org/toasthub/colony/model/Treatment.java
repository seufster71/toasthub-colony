package org.toasthub.colony.model;

import java.io.Serializable;
import java.time.Instant;
import java.util.List;

import org.toasthub.core.general.model.BaseEntity;


public class Treatment extends BaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	
	protected Instant startDate;
	protected Instant endDate;
	protected String treatmentName;
	protected String issue;
	
	protected String beforeTreatementResult;
	protected String afterTreatementResult;
	
	protected String workStatus;  // NEW, ACTIVE, COMPLETE
	protected String overallStatus;  // GOOD, BAD
	

	protected List<Note> notes;

	
	// Constructor
	public Treatment(){}
	

	// Methods

	
}
