package br.com.escuderodev.api_rest.api.dto.medico;

import br.com.escuderodev.api_rest.api.dto.endereco.DadosEndereco;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoMedico(
        @NotNull
        Long idmedico,
        String nome,
        String telefone,
        DadosEndereco endereco) {
}
