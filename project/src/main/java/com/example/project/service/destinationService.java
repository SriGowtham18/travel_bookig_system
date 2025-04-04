package com.example.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.entity.projectDestination;
import com.example.project.repository.destinationRep;

@Service
public class destinationService {
	//create
	@Autowired destinationRep rep;
	public List<projectDestination> getall() {
		return rep.findAll();
	}
	
	//post
	public projectDestination post(projectDestination user) {
		return rep.save(user);
}
	//delete
	public String deleteId(int destinationId) {
		if(rep.existsById(destinationId)) {
			rep.deleteById(destinationId);
			return "Value Deleted Successfully";
		}
		else {
			return "Value not found"+destinationId;
		}
	}
	
	//update
	public projectDestination updateid(int destinationId,projectDestination end) {
		if(rep.existsById(destinationId)) {
			projectDestination obj=rep.findById(destinationId).get();
			//obj.setLocation(end.getLocation());
			obj.setPrice(end.getPrice());
			return rep.save(obj);
		}
		return end;
	}
	public List<projectDestination> retrive_specific(String location,String country) {
		return rep.findByLocationAndCountry(location, country);
	}

	public List<projectDestination> fetchone(List<String> location) {
		return rep.findByLocationIn(location);
	}
	public List<projectDestination> start(String location) {
		return rep.findByLocationStartingWith(location);
	}
	public List<projectDestination> end(String location) {
		return rep.findByLocationEndingWith(location);
	}
	public List<projectDestination> contains(String location) {
		return rep.findByLocationContains(location);
	}
	public List<projectDestination> iscontains(String location) {
		return rep.findByLocationIsContaining(location);
	}
	public List<projectDestination> notcontains(String country) {
		return rep.findByCountryNotContains(country);
	}
	public List<projectDestination> notlike(String location) {
		return rep.findByLocationNotLike(location);
	}
	public List<projectDestination> dtask() {
		return rep.task();
	}
	public List<projectDestination> dtaskid(int destinationid) {
		return rep.task_1(destinationid);
	}
}