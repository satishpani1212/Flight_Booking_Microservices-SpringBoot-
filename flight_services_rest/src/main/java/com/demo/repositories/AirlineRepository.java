package com.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.demo.entities.Airline;

public interface AirlineRepository extends JpaRepository<Airline, Integer> {
	@Query(value = "SELECT u.status FROM airline u WHERE u.name = ?1",nativeQuery = true)
	public String isFound(String airline);

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
