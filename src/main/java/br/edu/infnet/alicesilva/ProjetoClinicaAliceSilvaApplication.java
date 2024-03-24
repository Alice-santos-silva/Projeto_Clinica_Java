package br.edu.infnet.alicesilva;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
@EnableFeignClients
@SpringBootApplication
public class ProjetoClinicaAliceSilvaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoClinicaAliceSilvaApplication.class, args);
	}

}
