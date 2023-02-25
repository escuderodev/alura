package br.com.escuderodev.api_rest.api.dto;

public record MedicosDTO(String nome, String email, String crm, Especialidade especialidade, DadosEndereco endereco) {
}
