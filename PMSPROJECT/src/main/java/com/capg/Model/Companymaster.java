package com.capg.Model;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Companymaster {
	
	private static final long serialVersionUIO=1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private int jobseekerId;
	
	private String jobseekerName;
	
	private String jobseekerContact;
	
    private String jobseekerAddress;
	
	private String jobseekerEmail;
	
	private int tenthPer;
	
	private int twelthPer;
	
	private int ugPer;

	
	@OneToOne(mappedBy="jobseeker")
	@JsonManagedReference
	private Shortlisted shortlisted;


	public int getJobseekerId() {
		return jobseekerId;
	}


	public void setJobseekerId(int jobseekerId) {
		this.jobseekerId = jobseekerId;
	}


	public String getJobseekerName() {
		return jobseekerName;
	}


	public void setJobseekerName(String jobseekerName) {
		this.jobseekerName = jobseekerName;
	}


	public String getJobseekerContact() {
		return jobseekerContact;
	}


	public void setJobseekerContact(String jobseekerContact) {
		this.jobseekerContact = jobseekerContact;
	}

	public String getJobseekerAddress() {
		return jobseekerAddress;
	}


	public void setJobseekerAddress(String jobseekerAddress) {
		this.jobseekerAddress = jobseekerAddress;
	}
	


	public String getJobseekerEmail() {
		return jobseekerEmail;
	}


	public void setJobseekerEmail(String jobseekerEmail) {
		this.jobseekerEmail = jobseekerEmail;
	}


	public int getTenthPer() {
		return tenthPer;
	}


	public void setTenthPer(int tenthPer) {
		this.tenthPer = tenthPer;
	}


	public int getTwelthPer() {
		return twelthPer;
	}


	public void setTwelthPer(int twelthPer) {
		this.twelthPer = twelthPer;
	}


	public int getUgPer() {
		return ugPer;
	}


	public void setUgPer(int ugPer) {
		this.ugPer = ugPer;
	}


	public Shortlisted getShortlisted() {
		return shortlisted;
	}


	public void setEligibility(Shortlisted shortlisted) {
		this.shortlisted = shortlisted;
	}


	public static long getSerialversionuio() {
		return serialVersionUIO;
	}
    public Companymaster(int jobseekerId, String jobseekerName,String jobseekerContact,String jobseekerAddress,String jobseekerEmail,int tenthPer,int twelthPer,int ugPer,Shortlisted shorlisted) {
    	super();
    	this.jobseekerId=jobseekerId;
    	this.jobseekerName=jobseekerName;
    	this.jobseekerContact=jobseekerContact;
    	this.jobseekerAddress=jobseekerAddress;
    	this.tenthPer=tenthPer;
    	this.twelthPer=twelthPer;
    	this.ugPer=ugPer;
    	this.shortlisted=shortlisted;
    }

	@Override
	public String toString() {
		return "Companymaster [jobseekerId=" + jobseekerId + ", jobseekerName=" + jobseekerName + ", jobseekerContact="
				+ jobseekerContact + ", jobseekerType=" + jobseekerAddress + ", jobseekerEmail=" + jobseekerEmail
				+ ", tenthPer=" + tenthPer + ", twelthPer=" + twelthPer + ", ugPer=" + ugPer + ", shortlisted="
				+ shortlisted + "]";
	}
	
	

}
