package br.edu.infnet.appreservaviagem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class AppreservaviagemApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppreservaviagemApplication.class, args);
	}

}
