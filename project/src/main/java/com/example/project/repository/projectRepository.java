package com.example.project.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.example.project.entity.*;

import jakarta.transaction.Transactional;

@Repository
public interface projectRepository extends JpaRepository<projectEntity,Integer>,PagingAndSortingRepository<projectEntity, Integer>{
	List<projectEntity> findAll();
	
	List<projectEntity> findByNameAndDeparture(String name,String departure);
	
	List<projectEntity> findByNameOrDeparture(String name,String departure);
	
	List<projectEntity> findByNameIn(List<String> name);
	
	List<projectEntity> findByNameStartingWith(String name);
	
	List<projectEntity> findByNameEndingWith(String name);
	
	List<projectEntity> findByNameContains(String name);
	
	List<projectEntity> findByNameIsContaining(String name);
	
	List<projectEntity> findByDepartureNotContains(String departure);
	
	List<projectEntity> findByNameNotLike(String name);
	
	@Query("SELECT d from projectEntity d")
	List<projectEntity> task();
	
	@Query("SELECT d from projectEntity d WHERE d.cusid=:cusid")
	List<projectEntity> task_1(@Param("cusid")int cusid);
	
	@Query("DELETE from projectEntity d WHERE d.cusid=:cusid")
	@Modifying
	@Transactional
	void delete(@Param("cusid")int cusid);

}