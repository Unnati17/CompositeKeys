package org.ncu.personck;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class PersonComposite implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String country;
	private String state;
	private String city;
	private int pincode;
	private String add_type;
	
	private PersonComposite()
	{
		
	}
	
	public PersonComposite(String country, String state, String city, int pincode, String add_type) {
		super();
		this.country = country;
		this.state = state;
		this.city = city;
		this.pincode = pincode;
		this.add_type = add_type;
	}
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getAdd_type() {
		return add_type;
	}
	public void setAdd_type(String add_type) {
		this.add_type = add_type;
	}
	@Override
	public String toString() {
		return "PersonComposite [country=" + country + ", state=" + state + ", city=" + city + ", pincode=" + pincode
				+ ", add_type=" + add_type + "]";
	}
	
	
	
	
	
	
	

}
