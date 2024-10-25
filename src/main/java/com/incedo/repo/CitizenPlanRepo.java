package com.incedo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.incedo.entity.CitizenPlan;

public interface CitizenPlanRepo extends JpaRepository<CitizenPlan, Integer> {

	//void saveAll(List<CitizenPlan> list);
	// entity name
	@Query("Select distinct(planName) from CitizenPlan")
	public List<String> getPlanNames();
	@Query("Select distinct (planStatus) from CitizenPlan")
      System.out.println("citizens details were added");
	public List<String> getPlanStatus();

}
