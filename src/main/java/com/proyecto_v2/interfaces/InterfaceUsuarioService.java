package com.proyecto_v2.interfaces;

import com.proyecto_v2.dto.entrada.LoginDtoEntrada;
import com.proyecto_v2.dto.entrada.UsuarioDtoEntrada;
import com.proyecto_v2.dto.modificar.UsuarioDtoModificar;
import com.proyecto_v2.dto.salida.TokenDtoSalida;
import com.proyecto_v2.dto.salida.UsuarioDtoSalida;

import java.util.List;

public interface InterfaceUsuarioService {
    TokenDtoSalida crearUsuarioConRol(UsuarioDtoEntrada usuarioDTOEntrada, String nombreRol);

    //UsuarioDtoSalida crearUsuarioAdmin(UsuarioDtoEntrada usuarioDTOEntrada);

    List<UsuarioDtoSalida> obtenerTodosLosUsuarios();

    UsuarioDtoSalida obtenerUsuarioPorId(Long idUsuario);

    UsuarioDtoSalida actualizarUsuario(UsuarioDtoModificar usuarioDTOModificar);

    void eliminarUsuario(Long idUsuario);

    TokenDtoSalida logearUsuario(LoginDtoEntrada loginDtoEntrada);
}
