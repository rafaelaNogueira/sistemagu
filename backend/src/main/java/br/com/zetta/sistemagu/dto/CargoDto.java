package br.com.zetta.sistemagu.dto;

import lombok.Data;

@Data
public class CargoDto {
    private String nome;

    public void setNome(String nome){
        this.nome = nome;
    }
}
