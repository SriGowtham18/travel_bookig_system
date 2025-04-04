package com.example.project.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="project")
public class projectEntity {

	@Id
	@Column(name="cusid")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int cusid;
	@Column(name="name")
	private String name;
	@Column(name="phone")
	private int phone;
	@Column(name="dep")
	private String departure;
	
	public projectEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public projectEntity(int cusid, String name, int phone, String departure, String destination, String hotel) {
		super();
		this.cusid = cusid;
		this.name = name;
		this.phone = phone;
		this.departure = departure;
		this.destination = destination;
		this.hotel = hotel;
	}
	public int getCus_id() {
		return cusid;
	}
	public void setCus_id(int cusid) {
		this.cusid = cusid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int l) {
		this.phone = l;
	}
	public String getDeparture() {
		return departure;
	}
	public void setDeparture(String departure) {
		this.departure = departure;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getHotel() {
		return hotel;
	}
	public void setHotel(String hotel) {
		this.hotel = hotel;
	}
	@Column(name="des")
	private String destination;
	@Column(name="hotel")
	private String hotel;
}
	
	