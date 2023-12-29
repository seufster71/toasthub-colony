package org.toasthub.colony.model;

import java.io.Serializable;

import org.toasthub.core.general.model.BaseEntity;


public class TransportHiveRequest extends BaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	
	protected String currentStatus;    // WAITING_FOR_PICKUP, IN_TRANSIT, WAITING_FOR_DROPOFF, COMPLETE
	
	protected String currentApiaryName;	// LHPF-1
	protected Address currentAddress;
	
	protected String destinationApiaryName;
	protected Address destinationAddress;
	
	protected Hive hive;

	
	// Constructor
	public TransportHiveRequest(){}
	

	// Methods


	
}
