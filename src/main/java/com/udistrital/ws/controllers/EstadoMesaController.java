package com.udistrital.ws.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.udistrital.ws.entity.models.EstadoMesa;
import com.udistrital.ws.entity.models.EstadoMesaId;
import com.udistrital.ws.entity.services.IEstadoMesaService;

@RestController
public class EstadoMesaController {
	@Autowired
	IEstadoMesaService estadoMesaService;
	
	@GetMapping("/estadomesas")
	public List<EstadoMesa> GetAll(){
		return estadoMesaService.getAll();
	}
	
	@GetMapping("/estadomesas/{estadomesaid}")
	public EstadoMesa Get(@PathVariable(value = "estadomesaid") EstadoMesaId estadomesaid){
		return estadoMesaService.get(estadomesaid);
	}
	
	@PostMapping("/estadomesas")
	public void Post(EstadoMesa estadoMesa) {
	estadoMesaService.post(estadoMesa);	
	}
	
	
	
	@DeleteMapping("/estadomesas/{estadomesaid}")
	public void Delete(@PathVariable(value = "estadomesaid") EstadoMesaId estadomesaid) {
		estadoMesaService.delete(estadomesaid);
	}
	
	@GetMapping("/findmesa/{cantidad}/{fecha_inicio}/{fecha_fin}")
	public String Getmesa(@PathVariable(value = "cantidad") long cantidad, @PathVariable(value = "fecha_inicio") String fecha_inicio, @PathVariable(value = "fecha_fin") String fecha_fin){
		return estadoMesaService.getmesa(cantidad,fecha_inicio,fecha_fin);
	}
	
	@GetMapping("/findzonas/{cantidad}/{fecha_inicio}/{fecha_fin}")
	public List<String> Getzona(@PathVariable(value = "cantidad") long cantidad, @PathVariable(value = "fecha_inicio") String fecha_inicio, @PathVariable(value = "fecha_fin") String fecha_fin){
		return estadoMesaService.getzonas(cantidad,fecha_inicio,fecha_fin);
	}
}
