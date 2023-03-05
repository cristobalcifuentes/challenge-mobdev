package com.cristobalcifuentes.api.consumer.interfaces;

import com.cristobalcifuentes.models.clients.CharacterClient;

public interface ICharacterApiConsumer {
	
	public CharacterClient getCharacterById(Integer idCharacter) throws Exception;

}
