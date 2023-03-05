package com.cristobalcifuentes.api.consumer.interfaces;

import com.cristobalcifuentes.models.clients.LocationClient;

public interface ILocationApiConsumer {
	
	public LocationClient getLocationApiById(Integer idLocation) throws Exception;

}
