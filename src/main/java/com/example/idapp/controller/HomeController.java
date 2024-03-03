package com.example.idapp.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestClient;

@Controller
public class HomeController {

	@Value("${spring.application.name}")
	String appName;

	@GetMapping("/")
	public String homePage(Model model) {
		model.addAttribute("appName", appName);
		model.addAttribute("uuid", uuid());
		return "home";
	}

	public static String uuid() {
		String uriBase = "http://localhost:8080/id-api/";
		RestClient restClient = RestClient.create();
		return restClient.get().uri(uriBase + "/uuid/v4").accept(MediaType.TEXT_PLAIN).retrieve().body(String.class);
	}
}
