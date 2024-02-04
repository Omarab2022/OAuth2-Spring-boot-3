package com.omar.Oauth2.Oauth2.Demo;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/vi/demo")
public class DemoController {


	@GetMapping
	public ResponseEntity<String> hello(){
		return ResponseEntity.ok("Hello from secure endpoint");
	}
}
