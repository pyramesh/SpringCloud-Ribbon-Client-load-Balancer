package com.ramesh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RibbonServerController {

	@Autowired
	Environment environment;

	@GetMapping("/")
	public String health() {
		return "I am Ok";
	}

	@GetMapping("/message")
	public String backend() {
		System.out.println("Inside MyRestController::backend...");
		String serverPort = environment.getProperty("local.server.port");
		System.out.println("Port : " + serverPort);
		return " RibbonServerController !!! " + " Host : localhost " + " :: Port : " + serverPort;
	}

}
