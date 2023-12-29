package org.toasthub.colony.model;

import java.io.Serializable;
import java.time.Instant;


public class Note implements Serializable {

	private static final long serialVersionUID = 1L;

	protected Instant swarmDate;
	protected String hiveCondition;
	protected String weatherCondition;
	protected String reasonForSwarm;
	protected boolean recovered;
	protected String notes;
	protected Integer queenCellCount;
	
	// Constructor
	public Note(){}
	

	// Methods

	
}
