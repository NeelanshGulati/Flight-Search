package com.nagarro.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Flight {
	@Id
	private String flightNo;
	private String depLoc;
	private String arrLoc;
	private String flightDate;
	private int flightTime;
	private float flightDur;
	private float fare;
	private String seatAvailability;
	private String flightClass;

	public String getFlightNo() {
		return flightNo;
	}

	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}

	public String getDepLoc() {
		return depLoc;
	}

	public void setDepLoc(String depLoc) {
		this.depLoc = depLoc;
	}

	public String getArrLoc() {
		return arrLoc;
	}

	public void setArrLoc(String arrLoc) {
		this.arrLoc = arrLoc;
	}

	public String getFlightDate() {
		return flightDate;
	}

	public void setFlightDate(String flightDate) {
		this.flightDate = flightDate;
	}

	public int getFlightTime() {
		return flightTime;
	}

	public void setFlightTime(int flightTime) {
		this.flightTime = flightTime;
	}

	public float getFlightDur() {
		return flightDur;
	}

	public void setFlightDur(float flightDur) {
		this.flightDur = flightDur;
	}

	public float getFare() {
		return fare;
	}

	public void setFare(float fare) {
		this.fare = fare;
	}

	public String getSeatAvailability() {
		return seatAvailability;
	}

	public void setSeatAvailability(String seatAvailability) {
		this.seatAvailability = seatAvailability;
	}

	public String getFlightClass() {
		return flightClass;
	}

	public void setFlightClass(String flightClass) {
		this.flightClass = flightClass;
	}

	public Flight(String flightNo, String depLoc, String arrLoc, String flightDate, int flightTime, float flightDur,
			float fare, String seatAvailability, String flightClass) {
		super();
		this.flightNo = flightNo;
		this.depLoc = depLoc;
		this.arrLoc = arrLoc;
		this.flightDate = flightDate;
		this.flightTime = flightTime;
		this.flightDur = flightDur;
		this.fare = fare;
		this.seatAvailability = seatAvailability;
		this.flightClass = flightClass;
	}

	public Flight() {
		super();
		// TODO Auto-generated constructor stub
	}
}
