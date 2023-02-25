package br.com.escuderodev.api_rest.api.controller;

import br.com.escuderodev.api_rest.api.dto.MedicosDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/medicos")
public class MedicosController {
    @PostMapping
    public void cadastraMedico(@RequestBody MedicosDTO medicos) {
        System.out.println("Dados recebidos: " + medicos);
    }
}
