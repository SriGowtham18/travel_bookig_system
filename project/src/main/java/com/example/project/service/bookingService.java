package com.example.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.entity.projectBooking;
import com.example.project.repository.bookingRep;

@Service
public class bookingService {
	//create
	@Autowired bookingRep rep;
	public List<projectBooking> getall() {
		return rep.findAll();
	}
	
	//post
	public projectBooking post(projectBooking user) {
		return rep.save(user);
	}
	
	//delete
		public String deleteId(int booking_id) {
			if(rep.existsById(booking_id)) {
				rep.deleteById(booking_id);
				return "Value Deleted Successfully";
			}
			else {	
				return "Value not found "+booking_id;
			}
		}

		//update
		public projectBooking updateid(int bookingId,projectBooking end) {
			if(rep.existsById(bookingId)) {
				projectBooking obj=rep.findById(bookingId).get();
				obj.setCustomer(end.getCustomer());
				obj.setBookingDate(end.getBookingDate());
				obj.setStatus(end.getStatus());
			}
			return end;
		}

}
