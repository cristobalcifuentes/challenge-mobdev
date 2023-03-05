package com.cristobalcifuentes.services.implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cristobalcifuentes.api.consumer.interfaces.ILocationApiConsumer;
import com.cristobalcifuentes.mapper.LocationClientToLocationDtoMapper;
import com.cristobalcifuentes.models.clients.LocationClient;
import com.cristobalcifuentes.models.dtos.LocationDto;
import com.cristobalcifuentes.services.interfaces.ILocationService;

@Service
public class LocationServiceImpl implements ILocationService{
	
	@Autowired
	private ILocationApiConsumer locationApiConsumer;

	@Autowired
	private LocationClientToLocationDtoMapper mapper;

	@Override
	public LocationDto getLocationDtoByid(String idLocation) throws Exception {
		LocationDto locationDto = null;
		try {
			Integer locationId = Integer.parseInt(idLocation);
			LocationClient locationClient = locationApiConsumer.getLocationApiById(locationId);
			locationDto = mapper.mappingTo(locationClient);
		} catch (NumberFormatException e) {
			return null;
		}catch (Exception e) {
			 e.printStackTrace();
			throw new Exception("error getting Location");
		}
		
		return locationDto;
	}

}
