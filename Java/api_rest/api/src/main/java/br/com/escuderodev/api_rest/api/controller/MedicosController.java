package br.com.escuderodev.api_rest.api.controller;

import br.com.escuderodev.api_rest.api.dto.medico.*;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

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
//        return repository.findAll(paginacao).map(DadosListagemMedico::new);
        return repository.findAllByAtivoTrue(paginacao).map(DadosListagemMedico::new);
    }

    @PutMapping
    @Transactional
    public void atualizar(@RequestBody @Valid DadosAtualizacaoMedico dados) {
        var medico = repository.getReferenceById(dados.idmedico());
        medico.atualizarInformacoes(dados);
    }

//    exclusão total
//    @DeleteMapping("/{idmedico}")
//    @Transactional
//    public void excluir(@PathVariable Long idmedico) {
//        repository.deleteById(idmedico);
//    }

//    exclusão lógica
    @DeleteMapping("/{idmedico}")
    @Transactional
    public void excluir(@PathVariable Long idmedico) {
        var medico = repository.getReferenceById(idmedico);
        medico.inativar();
    }

}
