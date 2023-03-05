package com.cristobalcifuentes.api.consumer.implement.rickandmorty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.client.RestTemplate;

public class ApiConsumerRickAndMorty {
	
	@Autowired
	protected RestTemplate restTemplate;
	
	@Value("${url.api.rick-and-morty}")
	protected String urlApi;
	
	protected final String ERROR_API = "error api rick and morty";
	
	protected final String CHARACTER_ENDPOINT = "/character/";
	
	protected final String LOCATION_ENDPOINT = "/location/";


}
