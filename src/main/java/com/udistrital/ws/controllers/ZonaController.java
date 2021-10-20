package com.udistrital.ws.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


import com.udistrital.ws.entity.models.Zona;
import com.udistrital.ws.entity.services.IZonaService;

@RestController
public class ZonaController {
	@Autowired
	IZonaService zonaService;
	
	@GetMapping("/zonas")
	public List<Zona> GetAll(){
		return zonaService.getAll();
	}
	
	@GetMapping("/zonas/{id_zona}")
	public Zona Get(@PathVariable(value = "id_zona") long id_zona){
		return zonaService.get(id_zona);
	}
	
	@PostMapping("/zonas")
	public void Post(Zona zona) {
	zonaService.post(zona);	
	}
	
	@DeleteMapping("/zonas/{id_zona}")
	public void Delete(@PathVariable(value = "id_zona") long id_zona) {
		zonaService.delete(id_zona);
	}
	
}
