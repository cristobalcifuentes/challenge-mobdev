package com.cristobalcifuentes.services.interfaces;

import com.cristobalcifuentes.models.dtos.CharacterDto;

public interface ICharacterService {
	
	/**
	 * obtiene el objeto CharacterDto por id
	 * @param idCharacter string con el valor del id del objeto character
	 * @return un objeto CharacterDto con los valores del character con el id indicado
	 * @throws Exception
	 */
	public CharacterDto getCharacterById(String idCharacter) throws Exception;

}
