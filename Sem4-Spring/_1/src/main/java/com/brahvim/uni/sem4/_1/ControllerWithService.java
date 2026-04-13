package com.brahvim.uni.sem4._1;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/forms")
public class ControllerWithService {

	// @Autowired // Use *this,* or the constructor.
	public final ServiceForController svc;

	public ControllerWithService(final ServiceForController p_svc) {
		this.svc = p_svc;
	}

	@PostMapping("/1")
	public ResponseEntity<Boolean> form1() {
		return ResponseEntity.ok(this.svc.createRegistration());
	}

}
