package com.jobs.domain;

public class Volunteer extends AbsStaffMember {

	//AÑADO UN ATRIBUTO DESCRIPTION

	private String description;

	public Volunteer(String name, String address, String phone, String description) throws Exception {
		super(name, address, phone);
		this.description=description;

	}


	@Override
	public String toString() {
		return "\nVolunteer \n name = "+name+" \n address = "+address+" \n phone = "+phone+" \n description = "+ this.description + "   \n";
	}

	@Override
	public void pay() {
		//TODO
		
	}

}
