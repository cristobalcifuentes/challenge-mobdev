package com.cristobalcifuentes.api.consumer.implement.rickandmorty;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cristobalcifuentes.api.consumer.interfaces.ILocationApiConsumer;
import com.cristobalcifuentes.models.clients.LocationClient;

@Service
public class LocationApiConsumerRickAndMorty extends ApiConsumerRickAndMorty implements ILocationApiConsumer{
	
	@Override
	public LocationClient getLocationApiById(Integer idLocation) throws Exception {
		String requestUrl = urlApi + LOCATION_ENDPOINT + idLocation;
		ResponseEntity<LocationClient> response = null;
		response  = restTemplate.getForEntity(requestUrl, LocationClient.class);
		if (response.getStatusCode() == HttpStatus.OK) {
			return response.getBody();
		} else {
			throw new Exception(ERROR_API);
		}
	}

}
