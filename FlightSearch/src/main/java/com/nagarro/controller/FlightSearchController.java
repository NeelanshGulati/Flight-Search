package com.nagarro.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.nagarro.model.Flight;
import com.nagarro.service.FlightSearchService;

@Controller
public class FlightSearchController {

	@Autowired
	private FlightSearchService flightSearchService;
	
	List<Flight> searchResult=new ArrayList<Flight>();
	List<Flight> sortedSearchResult=new ArrayList<Flight>();
	
	@RequestMapping(value = "/flightsearch", method = RequestMethod.POST)
	public ModelAndView getFlightList(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		String deploc = req.getParameter("deploc");
		String arrloc = req.getParameter("arrloc");
		String flightclass = req.getParameter("flightclass");
		String flightdate = req.getParameter("flightdate");
		String outputpref = req.getParameter("outputpref");
		
		searchResult=flightSearchService.searchFlight(deploc, arrloc, flightclass, flightdate);
		sortedSearchResult=flightSearchService.sortFlight(outputpref, searchResult);
		mv.addObject("lists",sortedSearchResult);
		
		if(sortedSearchResult.size()==0) {
			mv.setViewName("noFlightsError.jsp");
		}else {
			mv.setViewName("userhome.jsp");
		}

		System.out.println("Inside flight controller");

		return mv;
	}
}
