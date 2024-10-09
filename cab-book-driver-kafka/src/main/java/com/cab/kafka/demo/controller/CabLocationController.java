package com.cab.kafka.demo.controller;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cab.kafka.demo.service.CabLocationService;

@RestController
@RequestMapping("/location")
public class CabLocationController {

    @Autowired
    private CabLocationService cabLocationService;

    @PutMapping("/update") // Specify the request method and endpoint
    public ResponseEntity<Map<String, String>> updateLocation() {
        int range=100;
        
        while(range>0){
        	 LocalTime currentTime = LocalTime.now();
             DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
             String formattedTime = currentTime.format(formatter);
        	cabLocationService.updateLocation(formattedTime );
        	System.out.println("Current time :"+formattedTime);
        	try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}// update the topic every second
        	range--;
        }
    	return new ResponseEntity<>(Map.of("message", "Location Updated Successfully"), HttpStatus.OK);
    }
}
