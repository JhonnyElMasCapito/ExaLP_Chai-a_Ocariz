 package pe.edu.upeu.syscasos.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.syscasos.dao.Tipo_ordenDao;
import pe.edu.upeu.syscasos.entity.Tipo_orden;
import pe.edu.upeu.syscasos.service.Tipo_ordenService;

@Service
public class Tipo_ordenServiceImpl implements Tipo_ordenService{
	
	@Autowired
	private Tipo_ordenDao dao;
	
	@Override
	public Tipo_orden create(Tipo_orden c) {
		// TODO Auto-generated method stub
		return dao.create(c);
	}

	@Override
	public Tipo_orden update(Tipo_orden c) {
		// TODO Auto-generated method stub
		return dao.update(c);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Tipo_orden> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Tipo_orden> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}
}
