package com.datto.rmm.test.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.datto.rmm.test.form.FormObject;
import com.datto.rmm.test.model.Device;
import com.datto.rmm.test.model.EntitySpecification;
import com.datto.rmm.test.repository.DeviceRepository;

/**
 * 
 * @author tejoakkala Main Controller
 *
 */

@Controller
@RequestMapping(path = "/demo")
public class MainController {
	
	private final Logger logger = LoggerFactory.getLogger(MainController.class);

	@Autowired
	private DeviceRepository deviceRepository;

	@GetMapping(path = "/all")
	public String getAllDevices(Model model) {
		model.addAttribute("devices", deviceRepository.findAll());
		return "device";
	}

	@GetMapping(path = "/search")
	public String getDevice(Model model, @ModelAttribute("formObject") FormObject formObject, BindingResult result) {
     if(formObject.getSearchText() != null) {
		List<Device> devices = deviceRepository.findAll(EntitySpecification.textInAllColumns(formObject.getSearchText()));
	
		if(devices == null) {
			logger.info("list of devices found :" + devices.size());
			 return "search";
		}
		model.addAttribute("devices", devices);
		return "device";
     }
     return "search";
	}

	// public @ResponseBody Optional<Device> getDevice(Integer id) {
//			return deviceRepository.findById(id);
//		}		

}
