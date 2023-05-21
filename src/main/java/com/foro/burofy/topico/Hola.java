package com.foro.burofy.topico;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hola {
	
	@RequestMapping("/")
	public String hello() {
	
		return"Buen día";
		
	}
}
