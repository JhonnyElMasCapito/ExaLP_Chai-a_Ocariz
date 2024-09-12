package pe.edu.upeu.syscasos.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.upeu.syscasos.dao.Tipo_ordenDao;
import pe.edu.upeu.syscasos.entity.Tipo_orden;
import pe.edu.upeu.syscasos.repository.Tipo_OrdenRepository;

@Component
public class Tipo_ordenDaoImpl implements Tipo_ordenDao {
	
	@Autowired
	private Tipo_OrdenRepository tipo_OrdenRepository;
	
	@Override
	public Tipo_orden create(Tipo_orden c) {
		// TODO Auto-generated method stub
		return tipo_OrdenRepository.save(c);
	}

	@Override
	public Tipo_orden update(Tipo_orden c) {
		// TODO Auto-generated method stub
		return tipo_OrdenRepository.save(c);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		tipo_OrdenRepository.deleteById(id);
	}

	@Override
	public Optional<Tipo_orden> read(Long id) {
		// TODO Auto-generated method stub
		return tipo_OrdenRepository.findById(id);
	}

	@Override
	public List<Tipo_orden> readAll() {
		// TODO Auto-generated method stub
		return tipo_OrdenRepository.findAll();
	}

}
