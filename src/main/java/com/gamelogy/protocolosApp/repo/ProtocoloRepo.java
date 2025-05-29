package com.gamelogy.protocolosApp.repo;

import com.gamelogy.protocolosApp.model.Protocolo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProtocoloRepo extends JpaRepository<Protocolo, Long> {
}
