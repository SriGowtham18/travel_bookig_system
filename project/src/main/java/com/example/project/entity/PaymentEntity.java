package com.example.project.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "payment")
public class PaymentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "payment_id")
    private int paymentId;

    @Column(name = "booking_id", nullable = false)
    private int bookingId;

    @Column(name = "customer_id", nullable = false)
    private int customerId;

    @Column(name = "amount", nullable = false)
    private double amount;

    @Column(name = "payment_method", nullable = false)
    private String paymentMethod;

    @Column(name = "payment_status", nullable = false)
    private String paymentStatus;

	public Object getBookingId() {
		// TODO Auto-generated method stub
		return null;
	}
}
