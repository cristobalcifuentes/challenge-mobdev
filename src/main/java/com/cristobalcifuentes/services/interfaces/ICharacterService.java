package com.cristobalcifuentes.services.interfaces;

import com.cristobalcifuentes.models.dtos.CharacterDto;

public interface ICharacterService {
	
	public CharacterDto getCharacterById(String idCharacter) throws Exception;

}
