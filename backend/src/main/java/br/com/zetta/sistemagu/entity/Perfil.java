package br.com.zetta.sistemagu.entity;

import br.com.zetta.sistemagu.dto.PerfilDto;
import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(schema = "sgu", name = "perfil")
public class Perfil {

    @Id
    @Column(name = "id", updatable = false, nullable = false)
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;

    @NotNull
    @Column(name = "nome", unique = true)
    private String nome;

    @ManyToOne
    private Usuario usuario;


    public PerfilDto toDto() {
        PerfilDto perfil = new PerfilDto();
        perfil.setNome(this.nome);
        return perfil;
    }
}
