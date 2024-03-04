package com.SpringExampleTwo.vehicles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Service class is where Business Logic resides
 * Her data manipulation happens. All data formating and processing
 * happens here. Communicates with a Repository class for data
 */
@Service
public class VehiclesService {

    @Autowired
    VehiclesRepository vehiclesRepository;

    List<Vehicles> getVehicles(){
        return vehiclesRepository.findAll();
    }
    Optional<Vehicles> getVehiclesById(int id){
        return vehiclesRepository.findById(id);
    }

}
