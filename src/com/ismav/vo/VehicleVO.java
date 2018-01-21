package com.ismav.vo;

public class VehicleVO {

	private String vehicleID, vehicleManufacturer, serialNumber, model, type, color, route;
	private int seatCapacity, spaceCapacity;

	public VehicleVO(String vehicleID, String vehicleManufacturer, String serialNumber, String model, int seatCapacity,
			int spaceCapacity, String type, String color, String route) {
		this.vehicleID = vehicleID;
		this.vehicleManufacturer = vehicleManufacturer;
		this.serialNumber = serialNumber;
		this.model = model;
		this.type = type;
		this.color = color;
		this.route = route;
		this.seatCapacity = seatCapacity;
		this.spaceCapacity = spaceCapacity;
	}

	public String getVehicleID() {
		return vehicleID;
	}

	public String getType() {
		return type;
	}

	public String getColor() {
		return color;
	}

	public String getRoute() {
		return route;
	}

	public String getVehicleManufacturer() {
		return vehicleManufacturer;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public String getModel() {
		return model;
	}

	public int getSeatCapacity() {
		return seatCapacity;
	}

	public int getSpaceCapacity() {
		return spaceCapacity;
	}

}
