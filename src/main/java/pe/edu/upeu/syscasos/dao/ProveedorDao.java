package pe.edu.upeu.syscasos.dao;

import java.util.List;
import java.util.Optional;
import pe.edu.upeu.syscasos.entity.Proveedor;

public interface ProveedorDao {
	Proveedor create(Proveedor c);
	Proveedor update(Proveedor c);
	void delete(Long id);
	Optional<Proveedor> read(Long id);
	List<Proveedor> readAll();
}
