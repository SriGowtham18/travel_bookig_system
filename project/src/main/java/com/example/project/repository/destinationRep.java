package com.example.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.project.entity.projectDestination;
import jakarta.transaction.Transactional;


@Repository
public interface destinationRep extends JpaRepository<projectDestination,Integer>,PagingAndSortingRepository<projectDestination, Integer>{
	List<projectDestination> findAll();
	
	List<projectDestination> findByLocationAndCountry(String location,String country);
	
	List<projectDestination> findByLocationOrCountry(String location,String country);
	
	List<projectDestination> findByLocationIn(List<String> location);
	
	List<projectDestination> findByLocationStartingWith(String location);
	
	List<projectDestination> findByLocationEndingWith(String location);
	
	List<projectDestination> findByLocationContains(String location);
	
	List<projectDestination> findByLocationIsContaining(String location);
	
	List<projectDestination> findByCountryNotContains(String country);
	
	List<projectDestination> findByLocationNotLike(String location);
	
	@Query("SELECT d from projectDestination d")
	List<projectDestination> task();
	
	@Query("SELECT d from projectDestination d WHERE d.destinationId=:destinationId")
	List<projectDestination> task_1(@Param("destinationId")int destinationId);
	
	@Query("DELETE from projectDestination d WHERE d.destinationId=:destinationId")
	@Modifying
	@Transactional
	void delete(@Param("destinationId")int destinationId);
}
