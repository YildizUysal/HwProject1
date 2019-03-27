package com.project;

import java.sql.Timestamp;

public class Register {

	private String Name;
	private String Surname;
	private Timestamp BirthDate;
	private String BirthPlace;
	private String Email;
	private String Phone;
	private String Gender;
	private String GradDeggre;
	private String Address_1;
	private String Address_2;
	private String Country;
	private String State;
	private String ZipCode;
	private Timestamp RegDate;

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

	public String getGradDeggre() {
		return GradDeggre;
	}

	public void setGradDeggre(String gradDeggre) {
		GradDeggre = gradDeggre;
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
