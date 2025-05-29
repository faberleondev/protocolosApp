package com.gamelogy.protocolosApp.repo;

import com.gamelogy.protocolosApp.model.Kit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KitRepo extends JpaRepository<Kit, Long> {
}
