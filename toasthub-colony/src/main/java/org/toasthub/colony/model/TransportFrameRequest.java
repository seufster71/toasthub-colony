package org.toasthub.colony.model;

import java.io.Serializable;

import org.toasthub.core.general.model.BaseEntity;

public class TransportFrameRequest extends BaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	
	
	
	
	protected String currentColonyId;
	protected String apiaryName;	// LHPF-1
	protected Address physicalAddress;
	protected String physicalBoxStatus;

	protected Frame frame;
	
	// Constructor
	public TransportFrameRequest(){}
	

	// Methods


	
}
