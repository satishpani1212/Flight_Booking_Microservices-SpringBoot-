package com.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entities.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Integer> {

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
