package br.com.zetta.sistemagu.service;

import br.com.zetta.sistemagu.dto.UsuarioDto;
import br.com.zetta.sistemagu.entity.Usuario;
import br.com.zetta.sistemagu.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository repository;

    public List<UsuarioDto> getAll(){
        List<Usuario> usuarios = repository.findAll();
        List<UsuarioDto> usuariosDto = usuarios.stream().map(usuario -> usuario.toDto()).collect(Collectors.toList());
        return usuariosDto;
    }

}
