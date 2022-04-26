package com.angelfajardo.marvelisticos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.angelfajardo.marvelisticos.entities.Pelicula;
import com.angelfajardo.marvelisticos.services.IPeliculaService;

@CrossOrigin(origins = "*",allowedHeaders ="*")
@RestController
public class RestPeliculaController {
	@Autowired
	IPeliculaService peliculaService;
@GetMapping(path = "/peliculas", produces = {MediaType.APPLICATION_JSON_VALUE})
List<Pelicula> getPeliculas(){
	return peliculaService.findAll();
}
}
