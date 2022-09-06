package org.ncu.ck;

import java.util.Date;
import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.Table;

import org.ncu.personck.PersonComposite;

@Entity
@Table(name="person")
public class Person {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int person_id;
	
	private String person_name;
	private Date person_doj;
	private String person_email;
	private int person_age;
	
	@Embedded
	@ElementCollection
	@JoinTable(name = "per_address")
	private List<PersonComposite> perAddress;
	
	//private PersonComposite pCom;
	
//	@Embedded
//	@AttributeOverrides({	      
//		  @AttributeOverride( name = "country", column = @Column(name = "res_country")),
//		  @AttributeOverride( name = "state", column = @Column(name = "res_state")),
//		  @AttributeOverride( name = "city", column = @Column(name = "res_city")),
//		  @AttributeOverride( name = "pincode", column = @Column(name = "res_pin")),
//		  @AttributeOverride( name = "add_type", column = @Column(name = "res_type"))
//		})
//	private PersonComposite res; 
	
	
	
	
	
//	public PersonComposite getRes() {
//		return res;
//	}
//	public void setRes(PersonComposite res) {
//		this.res = res;
//	}
//	public PersonComposite getpCom() {
//		return pCom;
//	}
//	public void setpCom(PersonComposite pCom) {
//		this.pCom = pCom;
//	}
	public int getPerson_id() {
		return person_id;
	}
	public void setPerson_id(int person_id) {
		this.person_id = person_id;
	}
	public String getPerson_name() {
		return person_name;
	}
	public void setPerson_name(String person_name) {
		this.person_name = person_name;
	}
	public Date getPerson_doj() {
		return person_doj;
	}
	public void setPerson_doj(Date person_doj) {
		this.person_doj = person_doj;
	}
	public String getPerson_email() {
		return person_email;
	}
	public void setPerson_email(String person_email) {
		this.person_email = person_email;
	}
	public int getPerson_age() {
		return person_age;
	}
	public void setPerson_age(int person_age) {
		this.person_age = person_age;
	}
	
	
	public Person(String person_name, Date person_doj, String person_email, int person_age) 
	{
		super();
		this.person_name = person_name;
		this.person_doj = person_doj;
		this.person_email = person_email;
		this.person_age = person_age;
	}
	@Override
	public String toString() {
		return "Person [person_id=" + person_id + ", person_name=" + person_name + ", person_doj=" + person_doj
				+ ", person_email=" + person_email + ", person_age=" + person_age + "]";
	}
	
	
	
	
	
}
