package br.com.zetta.sistemagu.dto;

import lombok.Data;

@Data
public class PerfilDto {
    private String nome;

    public void setNome(String nome){
        this.nome = nome;
    }
}
