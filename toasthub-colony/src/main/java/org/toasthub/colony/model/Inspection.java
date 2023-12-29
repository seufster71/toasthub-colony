package org.toasthub.colony.model;

import java.io.Serializable;
import java.time.Instant;
import java.util.List;

import org.toasthub.core.general.model.BaseEntity;


public class Inspection extends BaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	
	protected Instant inspectionDate;
	protected String overallCondition;
	
	protected String weatherCondition;
	protected String inspectionPurpose;
	
	protected String containsBrood;
	protected String containsCappedHoney;
	protected String containsWaxMoth;
	
	protected Integer queenCellCount;
	
	protected String aggressionLevel;
	
	protected String workStatus;  // NEW, ACTIVE, COMPLETE
	protected String overallStatus;  // GOOD, BAD
	
	protected boolean replace;
	
	protected List<Note> notes;

	
	// Constructor
	public Inspection(){}
	

	// Methods

	
}
