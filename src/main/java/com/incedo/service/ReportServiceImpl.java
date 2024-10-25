package com.incedo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.incedo.entity.CitizenPlan;
import com.incedo.repo.CitizenPlanRepo;
import com.incedo.request.SearchRequest;

@Service
public class ReportServiceImpl implements ReportService {

	
	@Autowired
	private CitizenPlanRepo repo;
	
	
	@Override
	public List<String> getPlanNames() {
		List<String> pl = repo.getPlanNames();
		
		return pl;
	}

	@Override
	public List<String> getPlanStatuses() {
	
		return repo.getPlanStatus();
	}

	@Override
	public List<CitizenPlan> search(SearchRequest req) {
		List<CitizenPlan> st=  repo.findAll();
		return st;
	}

	@Override
	public boolean exportExcel() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean exporrtPdf() {
		// TODO Auto-generated method stub
		return false;
	}

}
