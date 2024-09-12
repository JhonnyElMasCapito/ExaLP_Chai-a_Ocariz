package pe.edu.upeu.syscasos.service;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.syscasos.entity.Tipo_orden;

public interface Tipo_ordenService {
	Tipo_orden create(Tipo_orden c);
	Tipo_orden update(Tipo_orden c);
	void delete(Long id);
	Optional<Tipo_orden> read(Long id);
	List<Tipo_orden> readAll();
}
