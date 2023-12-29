package org.toasthub.colony.model;

import java.io.Serializable;

public class Address implements Serializable {

	private static final long serialVersionUID = 1L;
	
	protected String id;
	
	protected String address1;
	protected String address2;
	protected String country;
	protected String city;
	protected String state;
	protected String postalCode;
	
	
	// Constructor
	public Address(){}
	
	public Address(String id){
		this.setId(id);
	}

	// Methods
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}


}
