package com.SpringExampleTwo.vehicles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

/**
 * REST controller for providing data in a JSon Format
 * Controller asks a Service for data
 */
@RestController
public class VehiclesController {

    @Autowired
    VehiclesService vehiclesService;

    /**
     * Returns ann of the vehicles as Json
     * @return
     */
    @GetMapping(value="/vehicles/", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<List<Vehicles>> getVehicles(){
        List<Vehicles> vehicles = vehiclesService.getVehicles();
        return new ResponseEntity<>(vehicles, HttpStatus.OK);
    }

    /**
     * Returns a vehicle with a specific id
     * @param id
     * @return
     */
    @GetMapping(value="/vehicles/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<Vehicles> getVehiclesById(@PathVariable(value = "id") Integer id){
        Optional<Vehicles> vehicles = vehiclesService.getVehiclesById(id);
        if(vehicles.isEmpty()){
            return new ResponseEntity<>(null, HttpStatus.OK);
        }
        return new ResponseEntity<>(vehicles.get(), HttpStatus.OK);
    }
    @GetMapping(value="/vehicles/makes/{make}", produces = MediaType.APPLICATION_JSON_VALUE)
    List<Vehicles> getVehiclesByMake(@PathVariable(value = "make") String make){
        return null; //TODO
    }
    @GetMapping(value="/vehicles/models/{model}", produces = MediaType.APPLICATION_JSON_VALUE)
    List<Vehicles> getVehiclesByModel(@PathVariable(value = "model") String model){
        return null;//TODO
    }
}
