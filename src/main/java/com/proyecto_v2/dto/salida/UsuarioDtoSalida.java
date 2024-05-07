package com.proyecto_v2.dto.salida;

import com.proyecto_v2.entity.Roles;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioDtoSalida {
    private Long idUsuario;
    private String nombre;
    private String email;
    private String password;
    private Set<Roles> roles = new HashSet<>();
}

