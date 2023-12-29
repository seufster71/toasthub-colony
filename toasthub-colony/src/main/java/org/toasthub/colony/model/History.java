package org.toasthub.colony.model;

import java.io.Serializable;
import java.time.Instant;
import java.util.List;


public class History implements Serializable {

	private static final long serialVersionUID = 1L;

	protected Instant changeDate;
	protected String description;
	protected List<HistoryField> historyFields;
	
	
	// Constructor
	public History(){}
	

	// Methods

	
}
