package pe.edu.upeu.syscasos.service;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.syscasos.entity.Forma_pago;

public interface Forma_pagoService {
	Forma_pago create(Forma_pago c);
	Forma_pago update(Forma_pago c);
	void delete(Long id);
	Optional<Forma_pago> read(Long id);
	List<Forma_pago> readAll();
}
