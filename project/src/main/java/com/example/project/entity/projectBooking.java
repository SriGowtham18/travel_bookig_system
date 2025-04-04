package com.example.project.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="booking")
public class projectBooking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="booking_id")
    private int bookingId;

   
    @Column(name="customer_id", nullable=false)
    private int customer;

    @Column(name="destination_id", nullable=false)
    private String destination;

    @Column(name="booking_date", nullable=false)
    private LocalDate bookingDate;

    @Column(name="status", nullable=false)
    private String status;

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public int getCustomer() {
		return customer;
	}

	public void setCustomer(int customer) {
		this.customer = customer;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public LocalDate getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(LocalDate bookingDate) {
		this.bookingDate = bookingDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}