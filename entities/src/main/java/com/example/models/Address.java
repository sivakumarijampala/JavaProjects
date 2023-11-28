package com.example.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "address")
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "addressid")
	private int id;
	private String lan1;
	private String lan2;
	private String state;

	@OneToOne
	@JoinColumn(name = "emp_id", referencedColumnName = "id")
	private Employee employee;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLan1() {
		return lan1;
	}

	public void setLan1(String lan1) {
		this.lan1 = lan1;
	}

	public Address() {
		super();
	}

	public Address(int id, String lan1, String lan2, String state) {
		super();
		this.id = id;
		this.lan1 = lan1;
		this.lan2 = lan2;
		this.state = state;
	}

	public String getLan2() {
		return lan2;
	}

	public void setLan2(String lan2) {
		this.lan2 = lan2;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
