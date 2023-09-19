package com.matera.bootcampmatera.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contas")
public class ContaController {
	
	@GetMapping
	public String teste(){
		return "opa!!";
	}
}
