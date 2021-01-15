package com.devsuperior.dscliente.resources;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dscliente.entities.Client;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {
	
	@GetMapping
	public ResponseEntity<List<Client>> findAll(){
		List<Client> list = new ArrayList<>();
		list.add(new Client(1L, "João", "52177801001", 1000.0, Instant.now(), 2));
		list.add(new Client(2L, "Maria", "65432692007", 2000.0, Instant.now(), 1));
		return ResponseEntity.ok().body(list);				
	}

}
