package io.oigres.ecomm.monitoring;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableAdminServer
@EnableDiscoveryClient
@EnableScheduling // to see updated kubernetes cluster information all time
public class MonitoringServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MonitoringServerApplication.class, args);
	}

}
