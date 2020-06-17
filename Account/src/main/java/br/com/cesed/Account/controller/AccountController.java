package br.com.cesed.Account.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/account")
public class AccountController {
	
	@GetMapping
	public ResponseEntity<String> testeAccount(){
		String a = "Eu sou o Account";
		return new ResponseEntity<String>(a,HttpStatus.OK);
	}

}
