package com.project;

import java.sql.Timestamp;

public class User {
	private int ID;
	private String Name;
	private String Surname;
	private Timestamp BirthDate;
	private String BirthPlace;
	private String Email;
	private String Phone;
	private String Gender;
	private String GradDegree;
	private String Address_1;
	private String Address_2;
	private String Country;
	private String State;
	private String ZipCode;
	private Timestamp RegDate;
	
	
	public User(int id, String name, String surname, Timestamp birthDate, String birthPlace, String email,
			String phone, String gender, String gradDegree, String address_1, String address_2, String country,
			String state, String zipCode, Timestamp regDate) {
		super();
		ID = id;
		Name = name;
		Surname = surname;
		BirthDate = birthDate;
		BirthPlace = birthPlace;
		Email = email;
		Phone = phone;
		Gender = gender;
		GradDegree = gradDegree;
		Address_1 = address_1;
		Address_2 = address_2;
		Country = country;
		State = state;
		ZipCode = zipCode;
		RegDate = regDate;
	}

	public User(int id, String name, String surname, String email) {
		super();
		ID = id;
		Name = name;
		Surname = surname;
		Email = email;
	}

	public User(int id) {
		super();
		ID = id;
	}

	public User() {
		super();
	}



	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getSurname() {
		return Surname;
	}

	public void setSurname(String surname) {
		Surname = surname;
	}

	public Timestamp getBirthDate() {
		return BirthDate;
	}

	public void setBirthDate(Timestamp birthDate) {
		BirthDate = birthDate;
	}

	public String getBirthPlace() {
		return BirthPlace;
	}

	public void setBirthPlace(String birthPlace) {
		BirthPlace = birthPlace;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getGradDegree() {
		return GradDegree;
	}

	public void setGradDegree(String gradDegree) {
		GradDegree = gradDegree;
	}

	public String getAddress_1() {
		return Address_1;
	}

	public void setAddress_1(String address_1) {
		Address_1 = address_1;
	}

	public String getAddress_2() {
		return Address_2;
	}

	public void setAddress_2(String address_2) {
		Address_2 = address_2;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getZipCode() {
		return ZipCode;
	}

	public void setZipCode(String zipCode) {
		ZipCode = zipCode;
	}

	public Timestamp getRegDate() {
		return RegDate;
	}

	public void setRegDate(Timestamp regDate) {
		RegDate = regDate;
	}

}
