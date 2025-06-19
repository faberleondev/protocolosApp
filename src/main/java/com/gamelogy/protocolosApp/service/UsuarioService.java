package com.gamelogy.protocolosApp.service;


import com.gamelogy.protocolosApp.model.Usuario;
import com.gamelogy.protocolosApp.repo.UsuarioRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {
    private final UsuarioRepo usuarioRepo;

    public UsuarioService(UsuarioRepo usuarioRepo){
        this.usuarioRepo = usuarioRepo;
    }
    public List<Usuario> obtenerUsuarios(){
        return usuarioRepo.findAll();
    }

    public Usuario crearUsuarioSiNoExiste(Usuario nuevo) {
        return usuarioRepo.findByEmail(nuevo.getEmail())
                .orElseGet(() -> usuarioRepo.save(nuevo));
    }

    public boolean existePorEmail(String email) {
        return usuarioRepo.existsByEmail(email.toLowerCase().trim());
    }


}
