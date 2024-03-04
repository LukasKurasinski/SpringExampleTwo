package com.SpringExampleTwo.vehicles;

import jakarta.persistence.*;

import lombok.Data;

/**
 * Class representing the vehicles table in the DB
 */
@Entity(name = "vehicles")
@Table(name = "vehicles")
@Data
public class Vehicles {

    //PK
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    @Id
    private Integer id;

    @Column(name = "make")
    private String make;
    @Column(name = "model")
    private String model;
    @Column(name = "year")
    private Integer year;



}
