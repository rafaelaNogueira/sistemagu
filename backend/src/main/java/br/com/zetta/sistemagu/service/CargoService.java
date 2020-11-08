package br.com.zetta.sistemagu.service;

import br.com.zetta.sistemagu.dto.CargoDto;
import br.com.zetta.sistemagu.entity.Cargo;
import br.com.zetta.sistemagu.repository.CargoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CargoService {

    @Autowired
    private CargoRepository repository;

    public List<CargoDto> getAll(){
        List<Cargo> cargos = repository.findAll();
        List<CargoDto> cargosDto = cargos.stream().map(cargo -> cargo.toDto()).collect(Collectors.toList());
        return cargosDto;
    }
}
