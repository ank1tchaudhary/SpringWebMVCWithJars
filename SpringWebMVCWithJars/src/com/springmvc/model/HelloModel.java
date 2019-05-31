package com.springmvc.model;

import java.util.List;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
//@JsonIgnoreProperties({"address"})
@JsonPropertyOrder({"fname","lname","phone"})
public class HelloModel {
	@JsonProperty("First_Name")
	private String fname;
	
	@JsonProperty("Last_Name")
	private String lname;
	
	@JsonProperty("Phone_Number")
	private String phone;
	
	//@JsonProperty("Complete_Address")
	private Address address;
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	private List<String> hobby;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public List<String> getHobby() {
		return hobby;
	}
	
	public void setHobby(List<String> hobby) {
		this.hobby = hobby;
	}
	

	public HelloModel(String fname,String lname, String i) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.phone = i;
		
	}
	

	public HelloModel() {
		super();
		
	}
	
	@Override
	public String toString() {
		return "HelloModel [fname=" + fname + ", lname=" + lname + ", phone=" + phone + ", address=" + address
				+ ", hobby=" + hobby + "]";
	}
	

}
