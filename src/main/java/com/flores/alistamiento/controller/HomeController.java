package com.flores.alistamiento.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    // Método para manejar la solicitud a la raíz del sitio
    @GetMapping("/index")
    public String index() {
        return "index"; // Devuelve la vista "index"
    }
}
