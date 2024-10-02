package com.spring.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.spring.address.Address;
import com.spring.interfaces.CustomerDetails;

@Component
public class GoldCustomer implements CustomerDetails {
	
	private String name;
	private String type;
	private Address adress;
	
	public GoldCustomer() {
		super();
	}
	
	public GoldCustomer(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}

	@Autowired
	public void setName(@Value("Darshan") String name) {
		this.name = name;
	}

	@Autowired
	public void setType(@Value("Gold Customer") String type) {
		this.type = type;
	}
	
	@Autowired
	public void setAdress(@Qualifier("bangaloreAddress") Address adress) {
		this.adress = adress;
	}

	@Override
	public void giveDetails() {
		System.out.println(name+" is a "+type+","+adress.giveAddress());
		
	}
	

}
