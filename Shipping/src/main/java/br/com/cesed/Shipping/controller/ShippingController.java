package br.com.cesed.Shipping.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/shipping")
public class ShippingController {
	
	@GetMapping
	public ResponseEntity<String> testeShipping() {
		String a = "Eu sou o Shipping";
		return new ResponseEntity<String>(a, HttpStatus.OK);
	}

}
