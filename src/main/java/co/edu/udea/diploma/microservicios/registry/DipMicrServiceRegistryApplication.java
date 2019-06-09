package co.edu.udea.diploma.microservicios.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DipMicrServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(DipMicrServiceRegistryApplication.class, args);
	}

}
