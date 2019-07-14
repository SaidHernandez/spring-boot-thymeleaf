package com.bolsasdeideas.springboot.app.comtrollers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexControllers {
    
	@Value("${application.controller.mensaje}")
	private String mensaje; 
	
	@GetMapping("/")
	public String holaMundo(Model model) {
		model.addAttribute("mensaje", mensaje); 
		
		return "hola";
	}
}
