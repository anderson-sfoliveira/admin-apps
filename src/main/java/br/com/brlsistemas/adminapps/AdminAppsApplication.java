package br.com.brlsistemas.adminapps;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class AdminAppsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdminAppsApplication.class, args);
	}

}
