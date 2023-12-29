package org.toasthub.colony.model;

import java.io.Serializable;
import java.time.Instant;
import java.util.List;

import org.toasthub.core.general.model.BaseEntity;


public class Swarm extends BaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	protected Instant swarmDate;
	protected String hiveCondition;
	protected String weatherCondition;
	protected String reasonForSwarm;
	protected boolean recovered;

	protected Integer queenCellCount;
	
	protected List<Note> notes;
	
	// Constructor
	public Swarm(){}
	

	// Methods

	
}
