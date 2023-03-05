package com.cristobalcifuentes.mapper;

import org.springframework.stereotype.Component;

import com.cristobalcifuentes.models.clients.LocationClient;
import com.cristobalcifuentes.models.dtos.LocationDto;

@Component
public class LocationClientToLocationDtoMapper {
	
	public LocationDto mappingTo(LocationClient locationClient) {
		
		return LocationDto.builder()
				.withName(locationClient.getName())
				.withUrl(locationClient.getUrl())
				.withDimension(locationClient.getDimension())
				.withResidents(locationClient.getResidents())
				.build();
	}
}
