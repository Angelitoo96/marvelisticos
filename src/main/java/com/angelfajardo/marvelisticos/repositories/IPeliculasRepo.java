package com.angelfajardo.marvelisticos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.angelfajardo.marvelisticos.entities.Pelicula;

public interface IPeliculasRepo extends JpaRepository<Pelicula, Integer>{

}
