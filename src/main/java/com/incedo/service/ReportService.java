package com.incedo.service;

import java.util.List;

import com.incedo.entity.CitizenPlan;
import com.incedo.request.SearchRequest;

public interface ReportService {

	public List<String> getPlanNames();
	
	public List<String> getPlanStatuses();
	
	public List<CitizenPlan> search(SearchRequest req);
	
	public boolean  exportExcel();
	
	public boolean exporrtPdf();
	
}
