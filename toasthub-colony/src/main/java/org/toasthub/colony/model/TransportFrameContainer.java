package org.toasthub.colony.model;

import java.io.Serializable;
import java.util.List;

import org.toasthub.core.general.model.BaseEntity;

public class TransportFrameContainer extends BaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	
	protected String containerId;
	
	protected String transportStatus; // AVAILABLE_FOR_USE, PICKUP, READY_FOR_TRANSIT

	protected List<TransportFrameRequest> transportFrameRequests;
	
	// Constructor
	public TransportFrameContainer(){}
	

	// Methods


	
}
