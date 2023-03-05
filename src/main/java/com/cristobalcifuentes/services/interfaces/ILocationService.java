package com.cristobalcifuentes.services.interfaces;

import com.cristobalcifuentes.models.dtos.LocationDto;

public interface ILocationService {
	
	/**
	 * obtiene el objeto Location por id
	 * @param idLocation String con el id del objeto location
	 * @return un objeto LocationDto con los valores de la location con el id indicado
	 * @throws Exception
	 */
	public LocationDto getLocationDtoByid(String idLocation) throws Exception;

}
