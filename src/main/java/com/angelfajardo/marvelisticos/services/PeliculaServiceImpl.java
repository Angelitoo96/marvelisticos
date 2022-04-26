package com.angelfajardo.marvelisticos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.angelfajardo.marvelisticos.entities.Pelicula;
import com.angelfajardo.marvelisticos.repositories.IPeliculasRepo;

@Service
public class PeliculaServiceImpl implements IPeliculaService{

	@Autowired
	IPeliculasRepo peliculasRepo;
	
	@Override
	public List<Pelicula> findAll() {
		List<Pelicula> películas = peliculasRepo.findAll();
		return películas;
	}

}
