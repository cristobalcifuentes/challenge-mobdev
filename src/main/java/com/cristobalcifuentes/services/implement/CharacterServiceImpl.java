package com.cristobalcifuentes.services.implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cristobalcifuentes.api.consumer.interfaces.ICharacterApiConsumer;
import com.cristobalcifuentes.mapper.CharacterClientToClientDtoMapper;
import com.cristobalcifuentes.models.clients.CharacterClient;
import com.cristobalcifuentes.models.dtos.CharacterDto;
import com.cristobalcifuentes.models.dtos.LocationDto;
import com.cristobalcifuentes.services.interfaces.ICharacterService;
import com.cristobalcifuentes.services.interfaces.ILocationService;

@Service
public class CharacterServiceImpl implements ICharacterService {

	@Autowired
	private ICharacterApiConsumer characterApiConsumer;
	
	@Autowired
	private CharacterClientToClientDtoMapper mapper;
	
	@Autowired
	private ILocationService locationService;

	@Override
	public CharacterDto getCharacterById(String idCharacter) throws Exception {
		CharacterDto characterDto = null;
		try {
			Integer characterId = Integer.parseInt(idCharacter);
			CharacterClient characterClient = characterApiConsumer.getCharacterById(characterId);
			 characterDto = mapper.mappingTo(characterClient);
			 LocationDto locationDto = locationService.getLocationDtoByid(
					 extractIdFromcharacterDto(characterDto));
			 characterDto.setOrigin(locationDto);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("error getting Character");
		}
		return characterDto;
	}
	
	private String extractIdFromcharacterDto(CharacterDto characterDto) {
		String url = characterDto.getOrigin().getUrl();
		String idLocation   = url.substring(url.lastIndexOf("/") + 1);
		return idLocation;
	}

}
