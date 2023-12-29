package org.toasthub.colony.model;

import java.io.Serializable;
import java.util.List;

import org.toasthub.core.general.model.BaseEntity;


public class TransportHiveContainer extends BaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	
	protected String trailerId;
	protected String vehicleId;
	
	protected String transportStatus;  // READY

	protected List<TransportHiveRequest> transportHiveRequests;

	
	// Constructor
	public TransportHiveContainer(){}
	

	// Methods


	
}
