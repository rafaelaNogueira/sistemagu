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
        List<PerfilDto> perfisDto = perfis.stream().map(cargo -> cargo.toDto()).collect(Collectors.toList());
        return perfisDto;
    }
}
