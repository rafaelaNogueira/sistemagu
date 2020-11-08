package br.com.zetta.sistemagu.controllers;

import br.com.zetta.sistemagu.dto.CargoDto;
import br.com.zetta.sistemagu.service.CargoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/cargos")
public class CargoController {

    @Autowired
    private CargoService service;

    @GetMapping(value = "/todos")
    public ResponseEntity<List<CargoDto>> getAll(){
        return ResponseEntity.ok().body(service.getAll());
    }
}
