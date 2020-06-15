package com.nagarro.dao;

import java.util.List;

import com.nagarro.model.Flight;

public interface FlightSearchDAO {
	public List<Flight> searchFlight(String deploc, String arrloc, String flightclass, String flightdate);
}
