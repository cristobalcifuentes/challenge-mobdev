package com.cristobalcifuentes.api.consumer.interfaces;

import com.cristobalcifuentes.models.clients.LocationClient;

public interface ILocationApiConsumer {

	/**
	 * consume la api que entrega el objeto Location a buscar por id
	 * 
	 * @param idLocation integer con el id del objeto Location a buscar
	 * @return un objeto LocationClient con sus valores seteados
	 * @throws Exception 
	 */
	public LocationClient getLocationApiById(Integer idLocation) throws Exception;

}
