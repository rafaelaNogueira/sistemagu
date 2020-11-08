package br.com.zetta.sistemagu.repository;

import br.com.zetta.sistemagu.entity.Cargo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CargoRepository extends JpaRepository<Cargo,String>{


    List<Cargo> findAllByOrderByNome();
}
