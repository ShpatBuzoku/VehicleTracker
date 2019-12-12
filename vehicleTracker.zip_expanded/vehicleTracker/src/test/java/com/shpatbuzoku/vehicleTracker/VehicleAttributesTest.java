package com.shpatbuzoku.vehicleTracker;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.shpatbuzoku.vehicleTracker.modelLayer.Vehicle;

class VehicleAttributesTest {

	@Test
	void testID() {
		Vehicle v = new Vehicle();
		v.setId(3);
		assertEquals(3,v.getId());
	}
	@Test
	void testVin() {
		Vehicle v = new Vehicle();
		v.setVin("ABC321");
		assertEquals("ABC321",v.getVin());
	}
	@Test
	void testOwner() {
		Vehicle v = new Vehicle();
		v.setOwner("Shpat Buzoku");
		assertEquals("Shpat Buzoku",v.getOwner());
	}
	@Test
	void testAddress() {
		Vehicle v = new Vehicle();
		v.setAddress("London, UK");
		assertEquals("London, UK",v.getAddress());
	}
	@Test
	void testRegistration() {
		Vehicle v = new Vehicle();
		v.setRegistration("A1B2");
		assertEquals("A1B2",v.getRegistration());
	}
	@Test
	void testStatus() {
		Vehicle v = new Vehicle();
		v.setStatus("CONNECTED");
		assertEquals("CONNECTED",v.getStatus());
	}

}
