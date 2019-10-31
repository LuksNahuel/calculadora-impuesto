package com.impuestos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ImpuestoController {

    @Autowired
    ImpuestoService is;
	
	@GetMapping("/")
    public String createPrecio(Model model) {
        model.addAttribute("precio", new Precio());
        return "inicio";
    }

    @PostMapping("/")
    public String readPrecio(@ModelAttribute Precio precio) {
        is.calcularIVA(precio);
    	return "inicio";
    }    
}
