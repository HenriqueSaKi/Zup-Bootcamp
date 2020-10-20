package com.java.springboot.zupBootcamp.ZupBootcampTest.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PaginaOneController {
	
	@RequestMapping("/cadastroCliente")
	public String form() {
		return "One/cadastroOne";
	}
}
