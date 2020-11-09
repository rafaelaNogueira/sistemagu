package br.com.zetta.sistemagu.repository;

import br.com.zetta.sistemagu.entity.Perfil;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PerfilRepository extends JpaRepository<Perfil,String> {

    List<Perfil> findAllByOrderByNome();

    Object findById(int id);
}
