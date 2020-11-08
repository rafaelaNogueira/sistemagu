package br.com.zetta.sistemagu.entity;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(schema = "sgu", name = "cargo")
public class Cargo {

    @Id
    @Column(name = "id", updatable = false, nullable = false)
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;

    @NotNull
    @Column(name = "nome", unique = true)
    private String nome;
}
