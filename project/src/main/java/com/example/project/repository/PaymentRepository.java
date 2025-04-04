package com.example.project.repository;

import com.example.project.entity.PaymentEntity;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends JpaRepository<PaymentEntity, Integer> {

	boolean existsById(int paymentId);

	
}
