package br.com.escuderodev.api_rest.api.dto;

public record DadosEndereco(String logradouro, String bairro, String cep, String cidade, String uf, String complemento, String numero) {
}
