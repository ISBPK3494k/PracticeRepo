package com.incedo.runner;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.incedo.entity.CitizenPlan;
import com.incedo.repo.CitizenPlanRepo;

@Component
public class DataLoader  implements ApplicationRunner{


	@Autowired
	private CitizenPlanRepo repo;
	
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		repo.deleteAll();
		
	  CitizenPlan c=new CitizenPlan();
	  c.setCitizenName("John");
	  c.setGender("male");
	  c.setPlanName("Cash");
	  c.setPlanStatus("approved");
	  c.setStartDate(LocalDate.now());
	  c.setEndDate(LocalDate.now());
	  c.setBenefitAmount(5000.00);
	  
		
	  CitizenPlan c1=new CitizenPlan();
	  c1.setCitizenName("Smith");
	  c1.setGender("male");
	  c1.setPlanName("Cash");
	  c1.setPlanStatus("Denied");
	  c1.setDenialReason("Rent Income");
	  
	  CitizenPlan c2=new CitizenPlan();
	  c2.setCitizenName("Cathy");
	  c2.setGender("female");
	  c2.setPlanName("Cash");
	  c2.setPlanStatus("Terminated");
	  c2.setStartDate(LocalDate.now().minusMonths(4));
	  c2.setEndDate(LocalDate.now().plusMonths(6));
	  c2.setBenefitAmount(5000.00);
	  c2.setTerminatedDate(LocalDate.now());
	  c2.setTerminationRsn("Employeed");
	  
	  
	  System.out.println("===============");
	  CitizenPlan c3=new CitizenPlan();
	  c3.setCitizenName("Devid");
	  c3.setGender("male");
	  c3.setPlanName("food");
	  c3.setPlanStatus("approved");
	  c3.setStartDate(LocalDate.now());
	  c3.setEndDate(LocalDate.now());
	  c3.setBenefitAmount(4000.00);
	  
		
	  CitizenPlan c4=new CitizenPlan();
	  c4.setCitizenName("Robert");
	  c4.setGender("male");
	  c4.setPlanName("Food");
	  c4.setPlanStatus("Denied");
	  c4.setDenialReason("Property Income");
	  
	  CitizenPlan c5=new CitizenPlan();
	  c5.setCitizenName("Orlen");
	  c5.setGender("female");
	  c5.setPlanName("Food");
	  c5.setPlanStatus("Terminated");
	  c5.setStartDate(LocalDate.now().minusMonths(4));
	  c5.setEndDate(LocalDate.now().plusMonths(6));
	  c5.setBenefitAmount(4000.00);
	  c5.setTerminatedDate(LocalDate.now());
	  c5.setTerminationRsn("Employeed");
	  
	  // medicl plan data
	  
	  CitizenPlan c6=new CitizenPlan();
	  c6.setCitizenName("Charles");
	  c6.setGender("male");
	  c6.setPlanName("medical");
	  c6.setPlanStatus("approved");
	  c6.setStartDate(LocalDate.now());
	  c6.setEndDate(LocalDate.now());
	  c6.setBenefitAmount(6000.00);
	  
		
	  CitizenPlan c7=new CitizenPlan();
	  c7.setCitizenName("Reno");
	  c7.setGender("male");
	  c7.setPlanName("medical");
	  c7.setPlanStatus("Denied");
	  c7.setDenialReason("Rent Income");
	  
	  CitizenPlan c8=new CitizenPlan();
	  c8.setCitizenName("Neel");
	  c8.setGender("female");
	  c8.setPlanName("Medical");
	  c8.setPlanStatus("Terminated");
	  c8.setStartDate(LocalDate.now().minusMonths(4));
	  c8.setEndDate(LocalDate.now().plusMonths(6));
	  c8.setBenefitAmount(5000.00);
	  c8.setTerminatedDate(LocalDate.now());
	  c8.setTerminationRsn("Govt Employeed");
	  
	  
	  
	  //  employeement plan data
	  
	  CitizenPlan c9=new CitizenPlan();
	  c9.setCitizenName("Lynal");
	  c9.setGender("male");
	  c9.setPlanName("Employement");
	  c9.setPlanStatus("approved");
	  c9.setStartDate(LocalDate.now());
	  c9.setEndDate(LocalDate.now());
	  c9.setBenefitAmount(5000.00);
	  
		
	  CitizenPlan c10=new CitizenPlan();
	  c10.setCitizenName("Steev");
	  c10.setGender("male");
	  c10.setPlanName("Employeement");
	  c10.setPlanStatus("Denied");
	  c10.setDenialReason("Rent Income");
	  
	  CitizenPlan c11=new CitizenPlan();
	  c11.setCitizenName("Moris");
	  c11.setGender("female");
	  c11.setPlanName("Emploeement");
	  c11.setPlanStatus("Terminated");
	  c11.setStartDate(LocalDate.now().minusMonths(4));
	  c11.setEndDate(LocalDate.now().plusMonths(6));
	  c11.setBenefitAmount(5000.00);
	  c11.setTerminatedDate(LocalDate.now());
	  c11.setTerminationRsn("Employeed");
	  
	  
	 
	List<CitizenPlan> list = Arrays.asList(c, c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11);
	   
	 repo.saveAll(list);
	  
	}

}
