package com.incedo.entity;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="CITIZEN_PLAN_INFO")
public class CitizenPlan {
     @Id
     @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "m1_seq_gen")
     @SequenceGenerator(name = "m1_seq_gen", sequenceName = "m1", allocationSize = 1)
	private Integer citizenId;
	private String citizenName;
	private String gender;
	private String planName;
	private String planStatus;
	@DateTimeFormat(pattern= "yyyy-MM-dd")
	private LocalDate startDate;
	@DateTimeFormat(pattern= "yyyy-MM-dd")
	private LocalDate endDate;
	private Double benefitAmount;
	private String denialReason;
	private LocalDate terminatedDate;
	private String terminationRsn;
	
}
