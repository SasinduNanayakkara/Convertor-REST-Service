package com.sas50.ConvertorRESTService;

import com.sas50.ConvertorRESTService.Config.SoapClientConfig;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ConvertorRestServiceApplication {

	public static void main(String[] args) {

		SpringApplication.run(ConvertorRestServiceApplication.class, args);
	}

	@Bean
	ApplicationRunner init() {
		return args -> {
			try {
				SoapClientConfig.initConvetorService();
			} catch (Exception e) {
				e.printStackTrace();
			}
		};
	}
}
