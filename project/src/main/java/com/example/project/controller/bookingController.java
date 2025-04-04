package com.example.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.entity.projectBooking;
import com.example.project.service.bookingService;

@RestController
public class bookingController {
	@Autowired bookingService std;
	@GetMapping("/bget")
	public List<projectBooking> all(){
		return std.getall();
	}
	
	@PostMapping("/bpost")
	public projectBooking postall(@RequestBody projectBooking obj) {
		return std.post(obj);
	}
	
	
	//delete
		@DeleteMapping("/bdelete/{booking_id}")
		public String deleted(@PathVariable int booking_id) {
			return std.deleteId(booking_id);
		}

		//update
		@PutMapping("/bupdate/{customer}")
		public projectBooking updatebuid(@PathVariable int customer,@RequestBody projectBooking end) {
			return std.updateid(customer, end);
		
}
}
