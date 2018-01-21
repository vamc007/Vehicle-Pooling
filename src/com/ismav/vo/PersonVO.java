package com.ismav.vo;

public class PersonVO {

	private String personID, personName, personRoute;
	private int personAge;

	public PersonVO(String personID, String personName, String personRoute, int personAge) {
		this.personID = personID;
		this.personName = personName;
		this.personRoute = personRoute;
		this.personAge = personAge;
	}

	public String getPersonID() {
		return personID;
	}

	public String getPersonName() {
		return personName;
	}

	public String getPersonRoute() {
		return personRoute;
	}

	public int getPersonAge() {
		return personAge;
	}

}
