package com.milton.spring.basico.di.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.milton.spring.basico.di.models.service.IServicio;

@Controller
public class IndexController {

	@Autowired
	private IServicio servicio;

	@GetMapping({ "", "/", "/index" })
	public String index(Model model) {
		model.addAttribute("objeto", servicio.operacion());
		return "index";
	}

}
