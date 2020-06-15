package com.nagarro.service;

import java.util.List;

import com.nagarro.model.Flight;

public interface FlightSearchService {
	public List<Flight> searchFlight(String deploc, String arrloc, String flightclass, String flightdate);

	public List<Flight> sortFlight(String outputpref, List<Flight> searchResult);
}
