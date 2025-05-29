package com.gamelogy.protocolosApp.repo;

import com.gamelogy.protocolosApp.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepo extends JpaRepository<Usuario, Long> {
    //Optional<Usuario> findByEmail(String email);
}
