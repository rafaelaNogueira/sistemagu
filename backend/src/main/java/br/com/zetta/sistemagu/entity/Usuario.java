package br.com.zetta.sistemagu.entity;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Entity
@Data
@Table(schema = "sgu", name = "usuario")
public class Usuario{

    @OneToMany
    @Column(name = "perfis") //Isso está certo?
    private List<Perfil> perfis;

    @Id
    @Column(name = "id", updatable = false, nullable = false)
    @GeneratedValue(strategy=GenerationType.AUTO)
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

    //@ManyToOne
    //@Column(name = "cargo")
    //private Cargo cargo;

    @NotNull
    @Column(name = "dataCadastro")
    private Date dataCadastro;

    /*
    public UsuarioDto toDto() {
        UsuarioDto usuario = new UsuarioDto();
        usuario.setNome(this.nome);
        return perfil;
    }
     */
}
