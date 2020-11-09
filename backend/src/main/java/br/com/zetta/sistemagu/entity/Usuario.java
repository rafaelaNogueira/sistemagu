package br.com.zetta.sistemagu.entity;

import br.com.zetta.sistemagu.dto.UsuarioDto;
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
public class Usuario extends Pessoa{

    @OneToMany
    @Column(name = "perfis") //Isso está certo?
    private List<Perfil> perfis;

    //@ManyToOne
    //@Column(name = "cargo")
    //private Cargo cargo;

    @NotNull
    @Column(name = "dataCadastro")
    private Date dataCadastro;

    public List<Perfil> getPerfis() {
        return perfis;
    }

    public void setPerfis(List<Perfil> perfis) {
        this.perfis = perfis;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public UsuarioDto toDto() {
        UsuarioDto usuario = new UsuarioDto();
        usuario.setNome(this.nome);
        return usuario;
    }

}
