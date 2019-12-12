package com.shpatbuzoku.vehicleTracker;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.shpatbuzoku.vehicleTracker.modelLayer.PageModel;

class ElementsInListTest {

	@Test
	void checkIfElementsList_isEmpty() {
		PageModel pagemodel = new PageModel();
		assertThat(pagemodel.listVehicles.isEmpty(), is(false));
	}

}
