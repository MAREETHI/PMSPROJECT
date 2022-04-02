package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class PmsprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(PmsprojectApplication.class, args);
		/*
		 * Companymaster cmp=new Companymaster();cmp.setCompanyAddress("Hyderabad");
		 * cmp.setCompanyContact(0123456789); cmp.setCompanyEmail("cmp@gmail.com");
		 * cmp.setCompanyId("cmp124"); cmp.setCompanyName("Capgemini");
		 * cmp.setCompanyType("Service"); cmp.setRating("ok");
		 * 
		 * 
		 * JobSeeker job=new Jobseeker(): job.setJobseekerAddress("Hyd");
		 * job.setJobseekerContact(8919955461); job.setJobseekerEmail("Job@gmail.com");
		 * job.setJobseekerId(5678); job.setJobseekerName("Reethu"); job.setTenthPer(80);
		 * job.setTwelthPer(88); job.setUgPer(75);
		 */
		
		
		
		
	}

}
