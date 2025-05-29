package com.gamelogy.protocolosApp.repo;

import com.gamelogy.protocolosApp.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepo extends JpaRepository<Paciente, Long> {
}
