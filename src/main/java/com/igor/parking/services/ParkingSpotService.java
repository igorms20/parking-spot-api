package com.igor.parking.services;

import org.springframework.stereotype.Service;

import com.igor.parking.dto.ParkingSpotDTO;
import com.igor.parking.models.ParkingSpot;
import com.igor.parking.repositories.ParkingSpotRepository;

@Service
public class ParkingSpotService {
    
    private final ParkingSpotRepository parkingSpotRepository;

    public ParkingSpotService(ParkingSpotRepository parkingSpotRepository) {
	this.parkingSpotRepository = parkingSpotRepository;
    }
    
    public ParkingSpot saveParkingSpot(ParkingSpotDTO parkingSpotDTO) {
	
	return parkingSpotDTO.convertToObject();
    }
    
    
    
}
