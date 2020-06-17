package br.com.cesed.Inventory.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/inventory")
public class InventoryController {
	
	@GetMapping
	public ResponseEntity<String> testeInventory() {
		String a = "Eu sou o inventory";
		return new ResponseEntity<String>(a, HttpStatus.OK);
	}

}
