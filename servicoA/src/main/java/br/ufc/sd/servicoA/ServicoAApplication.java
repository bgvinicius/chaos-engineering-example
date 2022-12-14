package br.ufc.sd.servicoA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ServicoAApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicoAApplication.class, args);
	}

}
