 package pe.edu.upeu.syscasos.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.syscasos.dao.Forma_pagoDao;
import pe.edu.upeu.syscasos.entity.Forma_pago;
import pe.edu.upeu.syscasos.service.Forma_pagoService;

@Service
public class Forma_pagoServiceImpl implements Forma_pagoService{
	
	@Autowired
	private Forma_pagoDao dao;
	
	@Override
	public Forma_pago create(Forma_pago c) {
		// TODO Auto-generated method stub
		return dao.create(c);
	}

	@Override
	public Forma_pago update(Forma_pago c) {
		// TODO Auto-generated method stub
		return dao.update(c);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Forma_pago> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Forma_pago> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}
}
