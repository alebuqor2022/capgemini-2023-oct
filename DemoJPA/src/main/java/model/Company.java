package model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Company {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column
	private String name;
	@Column
	private String address;
	@Column
	private String phone;
	
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name="fistName", column=@Column(name="contact_first_name")),
		@AttributeOverride(name="lastName", column=@Column(name="contact_last_name")),
		@AttributeOverride(name="phone", column=@Column(name="contact_phone"))
	})
	private ContactPerson contacto;
	
	
	
	

}
