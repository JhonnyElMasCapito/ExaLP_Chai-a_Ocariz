package pe.edu.upeu.syscasos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.syscasos.entity.Tipo_orden;
@Repository
public interface Tipo_OrdenRepository extends JpaRepository<Tipo_orden, Long>{

}