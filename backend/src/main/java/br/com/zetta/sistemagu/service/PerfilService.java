package br.com.zetta.sistemagu.service;

import br.com.zetta.sistemagu.dto.PerfilDto;
import br.com.zetta.sistemagu.entity.Perfil;
import br.com.zetta.sistemagu.repository.PerfilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PerfilService {

    @Autowired
    private PerfilRepository repository;

    public List<PerfilDto> getAll(){
        List<Perfil> perfis = repository.findAll();
        List<PerfilDto> perfisDto = perfis.stream().map(perfil -> perfil.toDto()).collect(Collectors.toList());
        return perfisDto;
    }

    public List<PerfilDto> editarPerfil(PerfilDto perfilDto) {

        Perfil perfis = (Perfil) repository.findById(perfilDto.getId());

        Perfil perfil = perfis;

        perfil.setNome(perfilDto.getNome());

        repository.save(perfil);
        return repository.findAll().stream().map(p -> p.toDto()).collect(Collectors.toList());
    }

    public List<PerfilDto> removerPerfil(PerfilDto perfilDto) {

        Perfil perfis = (Perfil) repository.findById(perfilDto.getId());

        Perfil perfil = perfis;

        repository.delete(perfil);
        return repository.findAll().stream().map(p -> p.toDto()).collect(Collectors.toList());

    }
}
