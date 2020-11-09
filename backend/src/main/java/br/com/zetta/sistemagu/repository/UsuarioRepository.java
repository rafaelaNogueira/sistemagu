package br.com.zetta.sistemagu.repository;

import br.com.zetta.sistemagu.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UsuarioRepository extends JpaRepository<Usuario,String> {

    List<Usuario> findAllByOrderByNome();
}
