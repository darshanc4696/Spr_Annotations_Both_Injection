package com.spring.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.spring.address.Address;
import com.spring.interfaces.CustomerDetails;

@Component
public class PlatinumCustomer implements CustomerDetails {
	
	private String name;
	private String type;
	private Address adress;
	
	public PlatinumCustomer() {
		super();
	}
	
	@Autowired
	public PlatinumCustomer(@Value("Indresh")String name, @Value("Platinum Customer")String type) {
		super();
		this.name = name;
		this.type = type;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setType( String type) {
		this.type = type;
	}

	@Autowired
	public void setAdress(@Qualifier("hyderabadAddress") Address adress) {
		this.adress = adress;
	}

	@Override
	public void giveDetails() {
		System.out.println(name+" is a "+type+","+adress.giveAddress());
		
	}
}
