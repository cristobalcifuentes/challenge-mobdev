package com.cristobalcifuentes.services.implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cristobalcifuentes.api.consumer.interfaces.ICharacterApiConsumer;
import com.cristobalcifuentes.mapper.CharacterClienttoClientDtoMapper;
import com.cristobalcifuentes.models.clients.CharacterClient;
import com.cristobalcifuentes.models.dtos.CharacterDto;
import com.cristobalcifuentes.services.interfaces.ICharacterService;

@Service
public class CharacterServiceImpl implements ICharacterService {

	@Autowired
	private ICharacterApiConsumer characterApiConsumer;
	
	@Autowired
	private CharacterClienttoClientDtoMapper mapper;

	@Override
	public CharacterDto getCharacterById(String idCharacter) {
		CharacterDto characterDto = null;
		try {
			Integer characterId = Integer.parseInt(idCharacter);
			CharacterClient characterClient = characterApiConsumer.getCharacterById(characterId);
			 characterDto = mapper.mappingTo(characterClient);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return characterDto;
	}

}
