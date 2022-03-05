package com.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entities.Flight;

public interface FlightRepository extends JpaRepository<Flight, Integer> {

}

//class Repository<T>{
//	saveComic(Comic c){
//		getConnection-> save 
//	}
//}
//class MobileRepository{
//	saveMobile(MObile m){
//		getConnection-> save 
//	}
//}
