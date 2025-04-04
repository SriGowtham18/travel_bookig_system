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
import com.example.project.entity.projectEntity;
import com.example.project.service.projectService;


@RestController
public class projectController {

	@Autowired projectService std;	
	
	@GetMapping("/pget")
	public List<projectEntity> all() {
		return std.getall();
	}
	
	@PostMapping("/post")
	public projectEntity postall(@RequestBody projectEntity obj) {
		return std.post(obj);
	}
	
	//delete
	@DeleteMapping("/delete/{cusid}")
	public String deleted(@PathVariable int cusid) {
		return std.deleteId(cusid);
	}
	
	//update
	@PutMapping("/update/{cusid}")
	public projectEntity updatebyid(@PathVariable int cusid,@RequestBody projectEntity end) {
		return std.updateid(cusid, end);
	}
	@GetMapping("/and")
	public List<projectEntity> specific(@RequestParam String name,@RequestParam String departure) {
		return std.retrive_specific(name, departure);
	}
	@GetMapping("/start")
	public List<projectEntity> startingwith(@RequestParam String name) {
		return std.start(name);
	}
	@GetMapping("/end")
	public List<projectEntity> endingwith(@RequestParam String name) {
		return std.end(name);
	}
	@GetMapping("/contain")
	public List<projectEntity> containing(@RequestParam String name) {
		return std.contains(name);
	}
	@GetMapping("/iscontain")
	public List<projectEntity> iscontaining(@RequestParam String name) {
		return std.iscontains(name);
	}
	@GetMapping("/notcontains")
	public List<projectEntity> notcontaining(@RequestParam String departure) {
		return std.notcontains(departure);
	}
	@GetMapping("/notlike")
	public List<projectEntity> notlike(@RequestParam String name) {
		return std.notlike(name);
	}
	@GetMapping("/task")
	public List<projectEntity> dbtask() {
		return std.dtask();
	}
	@GetMapping("/taskid")
	public List<projectEntity> dtaskid(@RequestParam int cusid) {
		return std.dtaskid(cusid);
	}

}
	

