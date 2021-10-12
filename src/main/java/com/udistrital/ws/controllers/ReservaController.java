package com.udistrital.ws.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.udistrital.ws.entity.models.Reserva;
import com.udistrital.ws.entity.models.ReservaFinal;
import com.udistrital.ws.entity.services.IReservaFinalService;
import com.udistrital.ws.entity.services.IReservaService;
@RestController
public class ReservaController {
@Autowired
	IReservaService reservaService;

@Autowired
IReservaFinalService reservaFinalService;

@GetMapping("/reservas")
public List<Reserva> GetAll(){
	return reservaService.getAll();
}

@GetMapping("/reservas/{codigo_reserva}")
public Reserva Get(@PathVariable(value = "codigo_reserva") long codigo_reserva){
	return reservaService.get(codigo_reserva);
}

@PostMapping("/reservas")
public void Post(Reserva reserva) {
reservaService.post(reserva);	
}

@PutMapping("/reservas")
public void Put(Reserva reserva, long id) {
	reservaService.put(reserva, id);
}

@DeleteMapping("/reservas/{codigo_reserva}")
public void Delete(@PathVariable(value = "codigo_reserva") long codigo_reserva) {
	reservaService.delete(codigo_reserva);
}

@PostMapping("/reservafinal")
public String insert(ReservaFinal reserva) {
return reservaFinalService.InsertReserva(reserva);	
}

}
