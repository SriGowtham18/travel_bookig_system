package com.example.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.entity.projectDestination;
import com.example.project.service.destinationService;

@RestController
public class destinationController {
	@Autowired destinationService std;
	@GetMapping("/dget")
	public List<projectDestination> all() {
		return std.getall();
	}
	
	@PostMapping("/dpost")
	public projectDestination postall(@RequestBody projectDestination obj) {
		return std.post(obj);
	}
	
	@DeleteMapping("/ddelete/{destinationId}")
	public String deleted(@PathVariable int destinationId) {
		return std.deleteId(destinationId);
	}
	
	//update
	@PutMapping("/dupdate/{price}")
	public projectDestination updatebyid(@PathVariable int price,@RequestBody projectDestination end) {
		return std.updateid(price, end);
		
}
	@GetMapping("/dand")
	public List<projectDestination> specific(@RequestParam String location,@RequestParam String country) {
		return std.retrive_specific(location, country);
	}
	@GetMapping("/dstart")
	public List<projectDestination> startingwith(@RequestParam String location) {
		return std.start(location);
	}
	@GetMapping("/dend")
	public List<projectDestination> endingwith(@RequestParam String location) {
		return std.end(location);
	}
	@GetMapping("/dcontain")
	public List<projectDestination> containing(@RequestParam String location) {
		return std.contains(location);
	}
	@GetMapping("/discontain")
	public List<projectDestination> iscontaining(@RequestParam String location) {
		return std.iscontains(location);
	}
	@GetMapping("/dnotcontains")
	public List<projectDestination> notcontaining(@RequestParam String country) {
		return std.notcontains(country);
	}
	@GetMapping("/dnotlike")
	public List<projectDestination> notlike(@RequestParam String location) {
		return std.notlike(location);
	}
	@GetMapping("/dtask")
	public List<projectDestination> dbtask() {
		return std.dtask();
	}
	@GetMapping("/dtaskid")
	public List<projectDestination> dtaskid(@RequestParam int destinationId) {
		return std.dtaskid(destinationId);
	}
}