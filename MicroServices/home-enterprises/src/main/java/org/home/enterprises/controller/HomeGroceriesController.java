package org.home.enterprises.controller;

import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.home.enterprises.vo.Groceries;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeGroceriesController {
	

	@GetMapping("getAllGroceries")
	public ResponseEntity<Groceries> getAllGroceries() {
		
		Groceries groceries = new Groceries();
		groceries.setGroceryId(UUID.randomUUID().toString());
		groceries.setBrand("");
		groceries.setExpDate(Instant.now());
		Map<String, Double> oil = new HashMap<String, Double>();
		oil.put("SunFlower Oil", 195.62);
		oil.put("Ground Nut Oil", 220.65);
		oil.put("Palmolien Oil", 149.75);
		oil.put("Coconut Oil", 89.63);

		Map<String, Double> rice = new HashMap<String, Double>();
		rice.put("BPT", 1256.92);
		rice.put("Basmati", 3120.22);
		rice.put("74", 1320.55); 
		

		List<Map<String, Double>> list1 = new ArrayList<Map<String, Double>>();
		list1.add(oil);
		List<Map<String, Double>> list2 = new ArrayList<Map<String, Double>>();
		list2.add(rice);

		Map<String, List<Map<String, Double>>> items = new HashMap<String, List<Map<String, Double>>>();
		items.put("Oil", list1);
		items.put("Rice", list2);
		groceries.setItems(items);
		
		return new ResponseEntity<Groceries>(groceries, HttpStatus.OK);
	}

}
