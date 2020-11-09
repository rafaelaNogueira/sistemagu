package br.com.zetta.sistemagu.dto;

import lombok.Data;

@Data
public class CargoDto {
    private int id;
    private String nome;

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getId() {
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }
}
