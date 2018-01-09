package com.cgal.sample;

import java.util.Collections;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

	@GetMapping(path = "/health-check")
	public Map<String, String> health() {
		return Collections.singletonMap("Healthy", "True");
	}

}
