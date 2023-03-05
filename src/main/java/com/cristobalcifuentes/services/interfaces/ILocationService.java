package com.cristobalcifuentes.services.interfaces;

import com.cristobalcifuentes.models.dtos.LocationDto;

public interface ILocationService {
	
	public LocationDto getLocationDtoByid(String idLocation) throws Exception;

}
