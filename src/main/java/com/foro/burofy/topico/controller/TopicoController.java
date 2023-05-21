package com.foro.burofy.topico.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.foro.burofy.topico.model.Topico;
import com.foro.burofy.topico.repository.TopicoRepository;

@RestController
@RequestMapping ("/topicos")
public class TopicoController {
	
	
	@Autowired
	public TopicoRepository topicoRepository;
		
	}
	
	@GetMapping
	public List<Topico> leer() {
		
		return topicoRepository.findAll();
		
	}

}
