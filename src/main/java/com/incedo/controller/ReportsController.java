package com.incedo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.incedo.entity.CitizenPlan;
import com.incedo.request.SearchRequest;
import com.incedo.service.ReportService;

@Controller
public class ReportsController {

	@Autowired
	private ReportService ser;
	
	@PostMapping("/search")
	public String handlerSearch(SearchRequest req,Model m)
	{
		System.out.println(req);
		
		List<CitizenPlan> plan = ser.search(req);
		m.addAttribute("plans", plan);
		init(m);
		return "index";
	}
	
	@GetMapping("/")
	public String  indexPage(Model m)
	{
		SearchRequest req=new SearchRequest();
		init(m);

		return "index";
	}
	
	private void init(Model m)
	{
		m.addAttribute("names", ser.getPlanNames());
		m.addAttribute("status", ser.getPlanStatuses());
	}
	
}
