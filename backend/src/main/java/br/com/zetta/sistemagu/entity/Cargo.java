package br.com.zetta.sistemagu.entity;

import br.com.zetta.sistemagu.dto.CargoDto;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public CargoDto toDto() {
        CargoDto cargo = new CargoDto();
        cargo.setNome(this.nome);
        return cargo;
    }
}
