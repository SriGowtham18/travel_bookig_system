package com.example.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.project.entity.projectEntity;
import com.example.project.repository.projectRepository;


@Service
public class projectService {
	
	//create
	@Autowired projectRepository rep;
	public List<projectEntity> getall() {
		return rep.findAll();
	}
	//post
	public projectEntity post(projectEntity user) {
		return rep.save(user);
	}
	//delete
	public String deleteId(int cusid) {
		if(rep.existsById(cusid)) {
			rep.deleteById(cusid);
			return "Value Deleted Successfully";
		}
		else {
			return "Value not found "+cusid;
		}
	}
	public projectEntity updateid(int cusid, projectEntity end) {
		// TODO Auto-generated method stub
		if(rep.existsById(cusid)) {
			projectEntity obj=rep.findById(cusid).get();
			obj.setPhone(end.getPhone());
			return rep.save(obj);
		}
		return end;
	}
	public List<projectEntity> retrive_specific(String name,String departure) {
		return rep.findByNameAndDeparture(name, departure);
	}

	public List<projectEntity> fetchone(List<String> name) {
		return rep.findByNameIn(name);
	}
	public List<projectEntity> start(String name) {
		return rep.findByNameStartingWith(name);
	}
	public List<projectEntity> end(String name) {
		return rep.findByNameEndingWith(name);
	}
	public List<projectEntity> contains(String name) {
		return rep.findByNameContains(name);
	}
	public List<projectEntity> iscontains(String name) {
		return rep.findByNameIsContaining(name);
	}
	public List<projectEntity> notcontains(String departure) {
		return rep.findByDepartureNotContains(departure);
	}
	public List<projectEntity> notlike(String name) {
		return rep.findByNameNotLike(name);
	}
	public List<projectEntity> dtask() {
		return rep.task();
	}
	public List<projectEntity> dtaskid(int cusid) {
		return rep.task_1(cusid);
	}

}