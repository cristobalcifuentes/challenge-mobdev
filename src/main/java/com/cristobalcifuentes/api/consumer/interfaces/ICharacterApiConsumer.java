package com.cristobalcifuentes.api.consumer.interfaces;

import com.cristobalcifuentes.models.clients.CharacterClient;

public interface ICharacterApiConsumer {

	/**
	 * consume la api que entrega el objeto Character a buscar por Id
	 * 
	 * @param idCharacter integer con el id del objeto Character a buscar
	 * @return un objeto CharacteClient con su valores seteados
	 * @throws Exception 
	 */
	public CharacterClient getCharacterById(Integer idCharacter) throws Exception;

}
