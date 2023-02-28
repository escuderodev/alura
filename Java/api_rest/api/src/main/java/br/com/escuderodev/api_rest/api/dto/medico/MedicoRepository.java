package br.com.escuderodev.api_rest.api.dto.medico;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicoRepository  extends JpaRepository<Medico,Long> {

}
