package com.shpatbuzoku.vehicleTracker.serviceLayer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shpatbuzoku.vehicleTracker.modelLayer.Vehicle;
import com.shpatbuzoku.vehicleTracker.modelLayer.VehicleRepository;


@Service
public class VehicleService {

	@Autowired
	private VehicleRepository repo;
	
	public List<Vehicle> listAll(){
		return repo.findAll();
	}
	public void save(Vehicle vehicle) {
		repo.save(vehicle);
	}

	public Vehicle get(int id) {
		return repo.findById(id).get();
	}

	public void delete(int id) {
		repo.deleteById(id);
	}
	public void connected(int id) {
		repo.connectedPing(id);
	}
	
	public void disconnected(int id) {
		repo.disconnectedPing(id);
	}
}
