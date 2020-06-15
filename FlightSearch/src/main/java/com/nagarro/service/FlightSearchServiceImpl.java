package com.nagarro.service;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.dao.FlightSearchDAO;
import com.nagarro.model.Flight;

@Service
public class FlightSearchServiceImpl implements FlightSearchService {

	@Autowired
	private FlightSearchDAO flightSearchDAO;

	public List<Flight> searchFlight(String deploc, String arrloc, String flightclass, String flightdate) {
		return flightSearchDAO.searchFlight(deploc, arrloc, flightclass, flightdate);
	}

	public List<Flight> sortFlight(String outputpref, List<Flight> searchResult) {
		if (outputpref.equals("fare")) {
			Comparator<Flight> comfare = new FareComparator();
			Collections.sort(searchResult, comfare);
		} else {
			Comparator<Flight> comfare = new FlightDurationComparator();
			Collections.sort(searchResult, comfare);
		}

		return searchResult;
	}
}

class FareComparator implements Comparator<Flight> {
	public int compare(Flight o1, Flight o2) {
		float o1Fare = o1.getFare();
		float o2Fare = o2.getFare();

		if (o1Fare > o2Fare) {
			return 1;
		}

		return -1;
	}
}

class FlightDurationComparator implements Comparator<Flight> {
	public int compare(Flight o1, Flight o2) {
		float o1FlightDur = o1.getFlightDur();
		float o2FlightDur = o2.getFlightDur();

		if (o1FlightDur > o2FlightDur) {
			return 1;
		}

		return -1;
	}
}
