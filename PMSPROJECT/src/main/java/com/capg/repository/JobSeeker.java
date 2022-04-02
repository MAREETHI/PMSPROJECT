package com.capg.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.capg.Model.Jobseeker;

@Repository
public interface JobSeeker extends JpaRepository<Jobseeker,Integer>{
	/*
	 * Eligibility findByeligibilityCandt(int tenthPer,int twelthPer,int ugPer);
	 * Eligibility findByTenthPer(int tenthPer);
	 */
	
	
	//List<JobSeeker>findByTenthPerAndTwelthPerAndugPer(int tenthMark,int
	//twelthMark,int UG);>twelthPer and ugPer>ugPer")
	
	
	@Query(value="select j.jobseekerId,j.jobseekerName from JobSeeker j where j.tenthPer>tenthPer and j.twelthPer>twelthPer and ugPer>ugPer")
List findByTenthPerAndTwelthPerAndUgPer(@Param("tenthMark")int tenthMark,
		@Param("twelthMark") int twelthMark,@Param("ugPer") int ugPer);			
}
