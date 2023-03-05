package com.cristobalcifuentes.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cristobalcifuentes.models.dtos.CharacterDto;
import com.cristobalcifuentes.services.interfaces.ICharacterService;

@RestController
public class CharacterController {
	
	@Autowired
	private ICharacterService characterService;
	
	@GetMapping("{id}")
	public ResponseEntity<CharacterDto> getCharacterById(@PathVariable String id){
		
		CharacterDto characterDto = characterService.getCharacterById(id);
		
		return new ResponseEntity<CharacterDto>(characterDto, HttpStatus.OK);
	}
	
	
}
