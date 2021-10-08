package com.udistrital.ws.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RestController;
import com.udistrital.ws.entity.models.ReservaMesa;
import com.udistrital.ws.entity.models.ReservaMesaId;
import com.udistrital.ws.entity.services.IReservaMesaService;

@RestController
public class ReservaMesaController {
	@Autowired
	IReservaMesaService reservaMesaService;
	
	@GetMapping("/reservamesas")
	public List<ReservaMesa> GetAll(){
		return reservaMesaService.getAll();
	}
	
	@GetMapping("/reservamesas/{reservamesaid}")
	public ReservaMesa Get(@PathVariable(value = "reservamesaid") ReservaMesaId reservamesaid){
		return reservaMesaService.get(reservamesaid);
	}
	
	@PostMapping("/reservamesas")
	public void Post(ReservaMesa reservaMesa) {
	reservaMesaService.post(reservaMesa);	
	}
	

	
	@DeleteMapping("/reservamesas/{reservamesaid}")
	public void Delete(@PathVariable(value = "reservamesaid") ReservaMesaId reservamesaid) {
		reservaMesaService.delete(reservamesaid);
	}
}
