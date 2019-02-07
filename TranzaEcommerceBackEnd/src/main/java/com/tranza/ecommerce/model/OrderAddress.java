package com.tranza.ecommerce.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Component
@Table(name="order_address")
public class OrderAddress implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ADDR_ID")
	private int orderAddressId;

	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
	@JoinColumn(name = "ORDER_ID")
	private Orders orders;

	@Column(name = "ADDR_FIRST_NAME")
	private String firstName;

	@Column(name = "ADDR_LAST_NAME")
	private String lastName;

	@Column(name = "ADDR_LINE_ONE")
	private String lineOne;

	@Column(name = "ADDR_LINE_TWO")
	private String lineTwo;

	@Column(name = "ADDR_LANDMARK")
	private String landmark;

	@Column(name = "ADDR_CITY")
	private String city;

	@Column(name = "ADDR_STATE")
	private String state;

	@Column(name = "ADDR_COUNTRY")
	private String country;

	@Column(name = "ADDR_PINCODE")
	private int pincode;

	@Column(name = "ADDR_MOBILE_NUMBER")
private String mobileNumber;

	public int getOrderAddressId() {
		return orderAddressId;
	}

	public void setOrderAddressId(int orderAddressId) {
		this.orderAddressId = orderAddressId;
	}

	public Orders getOrders() {
		return orders;
	}

	public void setOrders(Orders orders) {
		this.orders = orders;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLineOne() {
		return lineOne;
	}

	public void setLineOne(String lineOne) {
		this.lineOne = lineOne;
	}

	public String getLineTwo() {
		return lineTwo;
	}

	public void setLineTwo(String lineTwo) {
		this.lineTwo = lineTwo;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	

}
