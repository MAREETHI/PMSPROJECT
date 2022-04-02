package com.capg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.capg.Model.Jobseeker;
import com.capg.repository.JobSeeker;

public class JobseekerService {

	
	@Autowired
	JobSeeker jobseeker;
	public List<JobSeeker> fetchJobSeeker(int tenthMark,int twelthMark,int ugPer){
		List<JobSeeker> seeker=jobseeker.findByTenthPerAndTwelthPerAndUgPer(tenthMark,twelthMark,ugPer);
	System.out.println(seeker);
	return seeker;
	
	}
	public Jobseeker addJobseekerdetails(Jobseeker s) {
		Jobseeker js=jobseeker.save(s);
		return null;
	}
	

}
