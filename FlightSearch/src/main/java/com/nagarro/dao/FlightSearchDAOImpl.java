package com.nagarro.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nagarro.model.Flight;

@Repository
public class FlightSearchDAOImpl implements FlightSearchDAO {

	@Autowired
	private SessionFactory sessionFactory;
	List<Flight> matchedFlightList = new ArrayList<Flight>();

	public List<Flight> searchFlight(String deploc, String arrloc, String flightclass, String flightdate) {
		matchedFlightList.clear();
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from Flight where depLoc ='" + deploc + "' and arrLoc ='" + arrloc
				+ "' and flightDate = '" + flightdate + "' and seatAvailability = 'Y'");

		List<Flight> flightList = query.list();
		for (Flight f : flightList) {
			if (f.getFlightClass().contains(flightclass)) {
				matchedFlightList.add(f);
			}
		}

		session.close();
		System.out.println(matchedFlightList);
		return matchedFlightList;
	}

}
