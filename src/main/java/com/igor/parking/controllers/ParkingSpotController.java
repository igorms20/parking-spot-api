package com.igor.parking.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.igor.parking.dto.ParkingSpotDTO;
import com.igor.parking.models.ParkingSpot;
import com.igor.parking.services.ParkingSpotService;

@RestController
@RequestMapping("/parking-spot")
public class ParkingSpotController {

    private final ParkingSpotService parkingSpotService;

    public ParkingSpotController(ParkingSpotService parkingSpotService) {
	this.parkingSpotService = parkingSpotService;
    }
    
    @PostMapping
    public ResponseEntity<ParkingSpot> saveParkingSpot(@RequestBody ParkingSpotDTO parkingSpotDTO) {
	
	
	return ResponseEntity.status(HttpStatus.CREATED).body(parkingSpotService.saveParkingSpot(parkingSpotDTO));	
    }
}
