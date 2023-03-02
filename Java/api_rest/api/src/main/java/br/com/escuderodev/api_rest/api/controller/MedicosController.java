package br.com.escuderodev.api_rest.api.controller;

import br.com.escuderodev.api_rest.api.dto.medico.DadosListagemMedico;
import br.com.escuderodev.api_rest.api.dto.medico.Medico;
import br.com.escuderodev.api_rest.api.dto.medico.MedicoRepository;
import br.com.escuderodev.api_rest.api.dto.medico.DadosCadastroMedico;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medicos")
public class MedicosController {
    @Autowired
    private MedicoRepository repository;
    @PostMapping
    @Transactional
    public void cadastraMedico(@RequestBody @Valid DadosCadastroMedico dados) {

        repository.save(new Medico(dados));
    }

    @GetMapping
    public Page<DadosListagemMedico> listar(Pageable paginacao) {
        return repository.findAll(paginacao).map(DadosListagemMedico::new);
    }
}
