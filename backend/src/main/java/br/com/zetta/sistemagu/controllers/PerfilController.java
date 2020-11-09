package br.com.zetta.sistemagu.controllers;

import br.com.zetta.sistemagu.dto.PerfilDto;
import br.com.zetta.sistemagu.service.PerfilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/perfis")
public class PerfilController {

    @Autowired
    private PerfilService service;

    @GetMapping(value = "/todos")
    public ResponseEntity<List<PerfilDto>> getAll(){
        return ResponseEntity.ok().body(service.getAll());
    }
}
