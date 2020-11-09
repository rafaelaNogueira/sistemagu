package br.com.zetta.sistemagu.entity;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(schema = "sgu", name = "pessoa") //Preciso colocar ela na tabela? ela não é utilizada
public abstract class Pessoa {

    @Id
    @Column(name = "id", updatable = false, nullable = false)
    @GeneratedValue(strategy=GenerationType.AUTO) //Preciso disso mesmo para pessoa?
    private int id;

    @NotNull
    @Column(name = "nome", unique = true)
    private String nome;

    @NotNull
    @Column(name = "cpf", unique = true)
    private int cpf;

    @Column(name = "dataNascimento")
    private Date dataNascimento;

    @Column(name = "sexo")
    private char sexo;

    /*
    public PessoaDto toDto() { PRECISO MESMO DISSO?
        PessoaDto pessoa = new PessoaDto();
        pessoa.setNome(this.nome);
        return pessa;
    }
     */
}
