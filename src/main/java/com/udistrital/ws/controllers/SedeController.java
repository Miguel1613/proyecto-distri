package com.udistrital.ws.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.udistrital.ws.entity.models.Sede;
import com.udistrital.ws.entity.services.ISedeService;

@RestController
public class SedeController {
	@Autowired
	ISedeService sedeService;
	
	@GetMapping("/sedes")
	public List<Sede> GetAll(){
		return sedeService.getAll();
	}
	
	@GetMapping("/sedes/{id_sede}")
	public Sede Get(@PathVariable(value = "id_sede") long id_sede){
		return sedeService.get(id_sede);
	}
	
	@PostMapping("/sedes")
	public void Post(Sede sede) {
	sedeService.post(sede);	
	}
	
	@DeleteMapping("/sedes/{id_sede}")
	public void Delete(@PathVariable(value = "id_sede") long id_sede) {
		sedeService.delete(id_sede);
	}
}
