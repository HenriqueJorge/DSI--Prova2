package br.com.cesed.Order.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/order")
public class OrderController {
	
	@GetMapping
	public ResponseEntity<String> testeOrder() {
		String a = "Eu sou o Order";
		return new ResponseEntity<String>(a, HttpStatus.OK);
	}

}
