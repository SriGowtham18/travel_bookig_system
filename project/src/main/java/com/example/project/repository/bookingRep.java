package com.example.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.project.entity.projectBooking;

@Repository
public interface bookingRep extends JpaRepository <projectBooking,Integer>{
	List<projectBooking> findAll();
}
