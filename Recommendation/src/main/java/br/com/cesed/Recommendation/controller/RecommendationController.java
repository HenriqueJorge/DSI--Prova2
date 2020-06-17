package br.com.cesed.Recommendation.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/recommendation")
public class RecommendationController {
	
	@GetMapping
	public ResponseEntity<String> testeRecommendation() {
		String a = "Eu sou o Recommendation";
		return new ResponseEntity<String>(a, HttpStatus.OK);
	}

}
