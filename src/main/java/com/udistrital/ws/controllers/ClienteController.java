package com.udistrital.ws.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.udistrital.ws.entity.models.Cliente;
import com.udistrital.ws.entity.services.IClienteService;

@RestController
public class ClienteController {
	@Autowired
	IClienteService clienteService;
	
	@GetMapping("/clientes")
	public List<Cliente> GetAll(){
		return clienteService.getAll();
	}

	@GetMapping("/clientes/{cedula}")
	public Cliente Get(@PathVariable(value = "cedula") long cedula){
		return clienteService.get(cedula);
	}

	@PostMapping("/clientes")
	public void Post(Cliente cliente) {
	clienteService.post(cliente);	
	}

	@PutMapping("/clientes")
	public void Put(Cliente cliente, long cedula) {
		clienteService.put(cliente, cedula);
	}

	@DeleteMapping("/clientes/{cedula}")
	public void Delete(@PathVariable(value = "cedula") long cedula) {
		clienteService.delete(cedula);
	}
}
