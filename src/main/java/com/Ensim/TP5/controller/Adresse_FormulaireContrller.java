package com.Ensim.TP5.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.Ensim.TP5.model.AddressRepository;

@Controller
public class Adresse_FormulaireContrller {
	
	public String showFormular(Model model) {
		return "adresse";
}
}