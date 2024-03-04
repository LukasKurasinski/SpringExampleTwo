package com.SpringExampleTwo.vehicles;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository is responsible for fetching data from DB
 * It extends JpaRepository which has build in methods for data fetching from DB
 * Spring Boot creates queries automatically for build in methods.
 * Custom methods can be defined here with Custom queries to the DB
 * If custom methods follow naming convention well, Spring Boot will
 * be able to automatically create queries for them also
 */
@Repository
public interface VehiclesRepository extends JpaRepository<Vehicles, Integer> {

}
