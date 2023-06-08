package com.saf_saicoop.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api")
public class apiController {
	
	@PostMapping(value ="personaFisica",produces = {MediaType.APPLICATION_JSON_VALUE},consumes = {MediaType.APPLICATION_CBOR_VALUE})
	private ResponseEntity<?>InsertPersonaFisica(){
		return null;
	}

}
