package com.shpatbuzoku.vehicleTracker.modelLayer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface VehicleRepository extends JpaRepository<Vehicle, Integer>{
	
	@Transactional
	@Modifying(clearAutomatically = true)
	@Query(value ="UPDATE vehiclestracker.vehicle v SET v.Status = \"CONNECTED\" WHERE (v.id = :id)", nativeQuery=true)
	public void connectedPing(@Param("id") int id);
	
	@Transactional
	@Modifying(clearAutomatically = true)
	@Query(value ="UPDATE vehiclestracker.vehicle v SET v.Status = \"DISCONNECTED\" WHERE (v.id = :id)", nativeQuery=true)
	public void disconnectedPing(@Param("id") int id);

}
