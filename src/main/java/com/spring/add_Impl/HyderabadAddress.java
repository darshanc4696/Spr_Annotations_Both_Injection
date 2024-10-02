package com.spring.add_Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.spring.address.Address;

@Component
public class HyderabadAddress implements Address {
	
	private String place;
	private String pincode;

	public HyderabadAddress() {
		super();
	}
	
	@Autowired
	public HyderabadAddress(@Value("Ameerpet") String place, @Value("500073") String pincode) {
		super();
		this.place = place;
		this.pincode = pincode;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	@Override
	public String giveAddress() {
		
		return (place+","+pincode);

	}

}