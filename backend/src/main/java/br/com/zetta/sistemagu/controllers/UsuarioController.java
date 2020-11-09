package br.com.zetta.sistemagu.controllers;

import br.com.zetta.sistemagu.dto.UsuarioDto;
//import br.com.zetta.sistemagu.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {
    //@Autowired
    //private UsuarioService service;

    //@GetMapping(value = "/todos")
    //public ResponseEntity<List<UsuarioDto>> getAll(){
        //return ResponseEntity.ok().body(service.getAll());
    //}
}
