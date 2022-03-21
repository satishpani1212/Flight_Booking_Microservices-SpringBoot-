package com.demo.entities;

import java.time.LocalDateTime;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Flight {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int flightId;
	@Column(nullable = false) 
	private String name;
	@Column(nullable = false) 
	private String number;
	@Column(nullable = false)
	private String airline;
	@Column(nullable = false)
	private double rating ;
	@Column(nullable = false)
	private String from_city ;
	@Column(nullable = false)
	private String to_city ;
	@Column(nullable = false)
	private int bussiness_seats;
	@Column(nullable = false)
	private int nonBussiness_seats;
	@Column(nullable = false)
	private double vegMeal_price;
	@Column(nullable = false)
	private double nonVegMeal_price;
	@Column(nullable = false)
	private double bussiness_seat_price;
	@Column(nullable = false)
	private double non_bussiness_seat_price;
	@Column(nullable = false)
	private LocalDateTime arrival_time;
	@Column(nullable = false)
	private LocalDateTime departure_time;
	@Column(nullable = false)
	private String status;
	public int getFlightId() {
		return flightId;
	}
	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getAirline() {
		return airline;
	}
	public void setAirline(String airline) {
		this.airline = airline;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public String getFrom_city() {
		return from_city;
	}
	public void setFrom_city(String from_city) {
		this.from_city = from_city;
	}
	public String getTo_city() {
		return to_city;
	}
	public void setTo_city(String to_city) {
		this.to_city = to_city;
	}
	public int getBussiness_seats() {
		return bussiness_seats;
	}
	public void setBussiness_seats(int bussiness_seats) {
		this.bussiness_seats = bussiness_seats;
	}
	public int getNonBussiness_seats() {
		return nonBussiness_seats;
	}
	public void setNonBussiness_seats(int nonBussiness_seats) {
		this.nonBussiness_seats = nonBussiness_seats;
	}
	public double getVegMeal_price() {
		return vegMeal_price;
	}
	public void setVegMeal_price(double vegMeal_price) {
		this.vegMeal_price = vegMeal_price;
	}
	public double getNonVegMeal_price() {
		return nonVegMeal_price;
	}
	public void setNonVegMeal_price(double nonVegMeal_price) {
		this.nonVegMeal_price = nonVegMeal_price;
	}
	public double getBussiness_seat_price() {
		return bussiness_seat_price;
	}
	public void setBussiness_seat_price(double bussiness_seat_price) {
		this.bussiness_seat_price = bussiness_seat_price;
	}
	public double getNon_bussiness_seat_price() {
		return non_bussiness_seat_price;
	}
	public void setNon_bussiness_seat_price(double non_bussiness_seat_price) {
		this.non_bussiness_seat_price = non_bussiness_seat_price;
	}
	public LocalDateTime getArrival_time() {
		return arrival_time;
	}
	public void setArrival_time(LocalDateTime arrival_time) {
		this.arrival_time = arrival_time;
	}
	public LocalDateTime getDeparture_time() {
		return departure_time;
	}
	public void setDeparture_time(LocalDateTime departure_time) {
		this.departure_time = departure_time;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	
	
	
	
}
