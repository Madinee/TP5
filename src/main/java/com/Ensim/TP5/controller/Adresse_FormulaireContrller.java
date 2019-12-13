package com.Ensim.TP5.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@Controller
public class Adresse_FormulaireContrller {
	@GetMapping("/adresse")
	public String showFormular(Model model) {
		return "adresse";
}
}