package com.ismav.application;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.ismav.vo.PersonVO;
import com.ismav.vo.VehicleVO;

public class Application {

	public static void main(String[] args) {
		// System.out.println("vamsinath reddy");
		List<VehicleVO> allVehiclesInTown = new ArrayList<>();
		VehicleVO vehicleVOOne = new VehicleVO("001", "Maruthi", "AP23 1600", "AC 800", 3, 0, "car", "red",
				"Gachibowli");
		VehicleVO vehicleVOTwo = new VehicleVO("002", "Honda", "AP23 1935", "city civic", 3, 1, "car", "white",
				"Gachibowli");
		VehicleVO vehicleVOThree = new VehicleVO("003", "Echirer", "AP23 8456", "maximo", 2, 5, "truck", "white",
				"HitechCity");
		VehicleVO vehicleVOFour = new VehicleVO("004", "Tata", "AP23 8766", "indica", 3, 0, "car", "red", "Gachibowli");
		allVehiclesInTown.add(vehicleVOOne);
		allVehiclesInTown.add(vehicleVOTwo);
		allVehiclesInTown.add(vehicleVOThree);
		allVehiclesInTown.add(vehicleVOFour);
		PersonVO personVO = new PersonVO(args[0], args[1], args[2], Integer.parseInt(args[3]));
		findVehicle(personVO, allVehiclesInTown);
	}

	public static void findVehicle(PersonVO personVO, List<VehicleVO> allVehicles) {
		for (Iterator i = allVehicles.iterator(); i.hasNext();) {
			VehicleVO vehicleVO = (VehicleVO) i.next();
			if(vehicleVO.getRoute().equalsIgnoreCase(personVO.getPersonRoute())){
				System.out.println("Vehicle name: "+vehicleVO.getVehicleManufacturer()+" model: "+vehicleVO.getModel()+" number: "+vehicleVO.getSerialNumber());		
			}
		}
	}
}
