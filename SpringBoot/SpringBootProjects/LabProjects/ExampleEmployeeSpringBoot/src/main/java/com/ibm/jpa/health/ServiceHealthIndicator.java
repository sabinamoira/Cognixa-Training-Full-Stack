package com.ibm.jpa.health;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class ServiceHealthIndicator implements HealthIndicator{

	@Override
	public Health health() {
		if(isRunning()) {
			return Health.down().withDetail("Service A", "Not Available").build();
		}
		return Health.up().withDetail("Service A", "Available").build();
	}
	
	private Boolean isRunning() {
		//logic place-holder
		return true;
	}

}
