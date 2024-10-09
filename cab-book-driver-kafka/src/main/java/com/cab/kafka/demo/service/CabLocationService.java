package com.cab.kafka.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.cab.kafka.demo.constants.AppConstants;

@Service
public class CabLocationService {
	
	@Autowired
	private KafkaTemplate<String, Object> kafkaTemplate;
	
	public Boolean updateLocation(String location) {
		kafkaTemplate.send(AppConstants.CAB_TOPIC,location);
		
		return true;
	}
	
}
