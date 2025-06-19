package com.gamelogy.protocolosApp.controller;

import com.gamelogy.protocolosApp.model.Usuario;
import com.gamelogy.protocolosApp.model.enums.Rol;
import com.gamelogy.protocolosApp.service.UsuarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin/usuarios")
public class UsuarioController {
    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService){
        this.usuarioService = usuarioService;
    }

    @GetMapping("/lista")
    public ResponseEntity<List<Usuario>> obtenerUsuarios(){
        return ResponseEntity.ok(usuarioService.obtenerUsuarios());
    }

    @PostMapping("/autologin")
    public String registrarDesdeLogin(@RequestParam String email, @RequestParam String nombre) {
        Usuario nuevo = new Usuario();
        nuevo.setEmail(email);
        nuevo.setNombre(nombre);
        nuevo.setRol(Rol.OPERADOR);
        usuarioService.crearUsuarioSiNoExiste(nuevo);
        return "redirect:/dashboard";
    }
}
