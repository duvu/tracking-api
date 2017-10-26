package com.vd5.tracking;

import com.vd5.tracking.dcs.ServerManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class TrackingApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(TrackingApplication.class, args);
		context.getBean(ServerManager.class).init().start();
	}
}
