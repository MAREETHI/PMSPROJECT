package com.capg.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.Model.Jobseeker;
import com.capg.repository.JobSeeker;
import com.capg.service.JobseekerService;

@RestController
@RequestMapping("/Admin")

public class Controller {
	@Autowired
	JobseekerService service;
	@PostMapping("/addJobseekerdetails")
	public ResponseEntity<String> addJobseekerdetails(@RequestBody Jobseeker s) {
	System.out.println(s);
	Jobseeker js = service.addJobseekerdetails(s);
	return new ResponseEntity<String>(" Jobseeker registered succesfully", HttpStatus.OK);
	}
	
	@GetMapping("/checkShortlisted/{shortlistedId}/{jobseekerName}/{jobseekerContact}/{jobseekerAddress}/{tenthMark}/{twelthMark}/{ugPer}")
	public ResponseEntity<List<Jobseeker>> getShortlisted(@PathVariable int tenthMark,
			@PathVariable int twelthMark,@PathVariable int ugPer){
		
		System.out.println("tenth:" +tenthMark);
		System.out.println("twel" +twelthMark);
		System.out.println("UG" +ugPer);
		List<JobSeeker> jobseekerObj=service.fetchJobSeeker(tenthMark,twelthMark,ugPer);
		
		return new ResponseEntity<List<Jobseeker>>(HttpStatus.OK);
	}

	
}
