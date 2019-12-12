package com.shpatbuzoku.vehicleTracker.controllerLayer;

import java.util.List;
import java.util.Random;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.shpatbuzoku.vehicleTracker.modelLayer.PageModel;
import com.shpatbuzoku.vehicleTracker.modelLayer.Vehicle;
import com.shpatbuzoku.vehicleTracker.serviceLayer.VehicleService;

@Controller
public class AppController {

	@Autowired
	private VehicleService service;
	private PageModel pageModel;
	@RequestMapping("/")
	public String viewHomePage(Model model) throws InterruptedException {

		pageModel = new PageModel();
		pageModel.listVehicles = service.listAll();
		model.addAttribute("pageModel", pageModel);
		return "index";
	}
	
	@RequestMapping("/new")
	public String showNewProductForm(Model model) {
		Vehicle vehicle = new Vehicle();
		model.addAttribute("vehicle", vehicle);
		return "new_vehicle";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveVehicle(@Valid @ModelAttribute("vehicle") Vehicle vehicle, BindingResult result) {
		if(result.hasErrors()) {
			System.out.println("All fields must be filled!!!");
			return "new_vehicle";
		}
		else {
			service.save(vehicle);
			return "redirect:/";
		}
	}
	
	@RequestMapping("/delete/{id}")
	public String deleteVehicle(@PathVariable(name = "id") int id) {
		service.delete(id);

		return "redirect:/";
	}

	
	@RequestMapping("/connect")
	public String connectionPing() {
		
		Random randomIDpicker = new Random();
		Random randomStatusPicker = new Random();
        int vehiclesIDs = pageModel.listVehicles.size();
        int randomId = randomIDpicker.nextInt(vehiclesIDs) + 1;
        
        int statusTypes = 2;
		int randomStatus = randomStatusPicker.nextInt(statusTypes)+1;
		
		if(randomStatus == 1)
			service.connected(randomId);
		else
			service.disconnected(randomId);
		return "redirect:/";
	}
}
