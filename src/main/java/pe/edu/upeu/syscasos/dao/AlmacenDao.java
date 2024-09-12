package pe.edu.upeu.syscasos.dao;

import java.util.List;
import java.util.Optional;
import pe.edu.upeu.syscasos.entity.Almacen;

public interface AlmacenDao {
	Almacen create(Almacen c);
	Almacen update(Almacen c);
	void delete(Long id);
	Optional<Almacen> read(Long id);
	List<Almacen> readAll();
}
