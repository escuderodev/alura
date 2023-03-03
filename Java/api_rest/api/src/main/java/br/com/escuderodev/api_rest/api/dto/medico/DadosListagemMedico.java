package br.com.escuderodev.api_rest.api.dto.medico;

public record DadosListagemMedico(Long idmedico, String nome, String email, String crm, Especialidade especialidade) {

    public DadosListagemMedico(Medico medico) {
        this(medico.getIdmedico(), medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getEspecialidade());
    }
}
