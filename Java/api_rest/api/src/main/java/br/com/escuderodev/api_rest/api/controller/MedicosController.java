package br.com.escuderodev.api_rest.api.controller;

import br.com.escuderodev.api_rest.api.dto.medico.MedicoJPA;
import br.com.escuderodev.api_rest.api.dto.medico.MedicoRepository;
import br.com.escuderodev.api_rest.api.dto.medico.MedicosDTO;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/medicos")
public class MedicosController {
    @Autowired
    private MedicoRepository repository;
    @PostMapping
    @Transactional
    public void cadastraMedico(@RequestBody @Valid MedicosDTO dados) {
        repository.save(new MedicoJPA(dados));
    }
}
