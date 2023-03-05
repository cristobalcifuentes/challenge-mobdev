package com.cristobalcifuentes;

import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class PruebaTecnicaMobdevApplication {

	public static void main(String[] args) {
		SpringApplication.run(PruebaTecnicaMobdevApplication.class, args);
	}
	
	@Bean
    public RestTemplate restTemplate() {
		
		HttpComponentsClientHttpRequestFactory clientHttpRequestFactory = new HttpComponentsClientHttpRequestFactory(
	            HttpClientBuilder.create().build());
        return new RestTemplate(clientHttpRequestFactory);
    }

}
