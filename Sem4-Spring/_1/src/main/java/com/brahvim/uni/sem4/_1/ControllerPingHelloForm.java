package com.brahvim.uni.sem4._1;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerPingHelloForm {

	@GetMapping("/ping")
	public String doGet() {
		return "Pong!";
	}

	@GetMapping("/hello")
	public String doGet(

			final Model p_model,
			@RequestParam(name = "name", required = true, defaultValue = "World") final String p_name // `?name=World`.

	) {
		p_model.addAttribute("name", p_name);
		return String.format("Hello, %s!", p_name);
	}

	@PostMapping("/form")
	public String doPost() {
		return "Received form.";
	}

}
