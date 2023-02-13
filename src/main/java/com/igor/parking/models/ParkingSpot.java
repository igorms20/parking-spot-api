package com.igor.parking.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
public class ParkingSpot {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(nullable = false, unique = true, length = 10)
    private String parkingSpotNumber;
    @Column(nullable = false, unique = true, length = 7)
    private String licensePlateCar;
    @Column(nullable = false, length = 70)
    private String brandCar;
    @Column(nullable = false, length = 70)
    private String modelCar;
    @Column(nullable = false, length = 70)
    private String colorCar;
    @Column(nullable = false)
    private LocalDateTime registrationDate;
    @Column(nullable = false, length = 130)
    private String responsibleName;
    @Column(nullable = false, length = 30)
    private String apartment;
    @Column(nullable = false, length = 30)
    private String block;

    public UUID getId() {
	return id;
    }

    public void setId(UUID id) {
	this.id = id;
    }

    public String getParkingSpotNumber() {
	return parkingSpotNumber;
    }

    public void setParkingSpotNumber(String parkingSpotNumber) {
	this.parkingSpotNumber = parkingSpotNumber;
    }

    public String getLicensePlateCar() {
	return licensePlateCar;
    }

    public void setLicensePlateCar(String licensePlateCar) {
	this.licensePlateCar = licensePlateCar;
    }

    public String getBrandCar() {
	return brandCar;
    }

    public void setBrandCar(String brandCar) {
	this.brandCar = brandCar;
    }

    public String getModelCar() {
	return modelCar;
    }

    public void setModelCar(String modelCar) {
	this.modelCar = modelCar;
    }

    public String getColorCar() {
	return colorCar;
    }

    public void setColorCar(String colorCar) {
	this.colorCar = colorCar;
    }

    public LocalDateTime getRegistrationDate() {
	return registrationDate;
    }

    public void setRegistrationDate(LocalDateTime registrationDate) {
	this.registrationDate = registrationDate;
    }

    public String getResponsibleName() {
	return responsibleName;
    }

    public void setResponsibleName(String responsibleName) {
	this.responsibleName = responsibleName;
    }

    public String getApartment() {
	return apartment;
    }

    public void setApartment(String apartment) {
	this.apartment = apartment;
    }

    public String getBlock() {
	return block;
    }

    public void setBlock(String block) {
	this.block = block;
    }

    public static class Builder {
	private UUID id;
	private String parkingSpotNumber;
	private String licensePlateCar;
	private String brandCar;
	private String modelCar;
	private String colorCar;
	private LocalDateTime registrationDate;
	private String responsibleName;
	private String apartment;
	private String block;

	public Builder id(UUID id) {
	    this.id = id;
	    return this;
	}

	public Builder parkingSpotNumber(String parkingSpotNumber) {
	    this.parkingSpotNumber = parkingSpotNumber;
	    return this;
	}

	public Builder licensePlateCar(String licensePlateCar) {
	    this.licensePlateCar = licensePlateCar;
	    return this;
	}

	public Builder brandCar(String brandCar) {
	    this.brandCar = brandCar;
	    return this;
	}

	public Builder modelCar(String modelCar) {
	    this.modelCar = modelCar;
	    return this;
	}

	public Builder colorCar(String colorCar) {
	    this.colorCar = colorCar;
	    return this;
	}

	public Builder registrationDate(LocalDateTime registrationDate) {
	    this.registrationDate = registrationDate;
	    return this;
	}

	public Builder responsibleName(String responsibleName) {
	    this.responsibleName = responsibleName;
	    return this;
	}

	public Builder apartment(String apartment) {
	    this.apartment = apartment;
	    return this;
	}

	public Builder block(String block) {
	    this.block = block;
	    return this;
	}

	public ParkingSpot build() {
	    return new ParkingSpot(this);
	}
    }

    private ParkingSpot(Builder builder) {
	this.id = builder.id;
	this.parkingSpotNumber = builder.parkingSpotNumber;
	this.licensePlateCar = builder.licensePlateCar;
	this.brandCar = builder.brandCar;
	this.modelCar = builder.modelCar;
	this.colorCar = builder.colorCar;
	this.registrationDate = builder.registrationDate;
	this.responsibleName = builder.responsibleName;
	this.apartment = builder.apartment;
	this.block = builder.block;
    }
}
