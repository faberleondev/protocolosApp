package com.gamelogy.protocolosApp.repo;

import com.gamelogy.protocolosApp.model.Agenda;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgendaRepo extends JpaRepository<Agenda, Long> {

}
