package br.com.zetta.sistemagu.dto;

import br.com.zetta.sistemagu.entity.Cargo;
import lombok.Data;

import java.util.Date;

@Data
public class UsuarioDto {
    //Tenho que fazer de todos ou só do nome?
    private String nome;
    private int cpf;
    private Date dataNascimento;
    private char sexo;
    //Com devo fazer com cargo?
    private CargoDto cargo;
    //Como devo fazer com perfis?
    private Date dataCadastro;

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
}

