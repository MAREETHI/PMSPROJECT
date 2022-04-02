package com.capg.Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="SHORTLISTED")
public class Shortlisted {
	
	@Id
	private int shortlistedId;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JsonBackReference
	@JoinColumn(name="jobseekerId")
	private Companymaster company;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="jobseekerId")
	@JsonBackReference
	private Jobseeker jobseeker;
	
	private int writtenTest;
	
	private int groupDiscussion;
	
	private int humanResource;
	
	private String remarks;
	
	private int passoutYear;
	
	private String rating;

	public int getId() {
		return shortlistedId;
	}

	public void setEligibilityId(int shortlistedId) {
		this.shortlistedId = shortlistedId;
	}

	public Companymaster getCompany() {
		return company;
	}

	public void setCompany(Companymaster company) {
		this.company = company;
	}

	public Jobseeker getJobseeker() {
		return jobseeker;
	}

	public void setJobseeker(Jobseeker jobseeker) {
		this.jobseeker = jobseeker;
	}

	public int getWrittenTest() {
		return writtenTest;
	}

	public void setWrittenTest(int writtenTest) {
		this.writtenTest = writtenTest;
	}

	public int getGroupDiscussion() {
		return groupDiscussion;
	}

	public void setGroupDiscussion(int groupDiscussion) {
		this.groupDiscussion = groupDiscussion;
	}

	public int getHumanResource() {
		return humanResource;
	}

	public void setHumanResource(int humanResource) {
		this.humanResource = humanResource;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public int getPassoutYear() {
		return passoutYear;
	}

	public void setPassoutYear(int passoutYear) {
		this.passoutYear = passoutYear;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Shortlisted [shortlistedId=" + shortlistedId + ", company=" + company + ", jobseeker=" + jobseeker
				+ ", writtenTest=" + writtenTest + ", groupDiscussion=" + groupDiscussion + ", humanResource="
				+ humanResource + ", remarks=" + remarks + ", passoutYear=" + passoutYear + ", rating=" + rating + "]";
	}

	public Shortlisted(int eligibilityId, Companymaster company, Jobseeker jobseeker, int writtenTest,
			int groupDiscussion, int humanResource, String remarks, int passoutYear, String rating) {
		super();
		this.shortlistedId = shortlistedId;
		this.company = company;
		this.jobseeker = jobseeker;
		this.writtenTest = writtenTest;
		this.groupDiscussion = groupDiscussion;
		this.humanResource = humanResource;
		this.remarks = remarks;
		this.passoutYear = passoutYear;
		this.rating = rating;
	}
	public Shortlisted() {
		super();
	}

}
