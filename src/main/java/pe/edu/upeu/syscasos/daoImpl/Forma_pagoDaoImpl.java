package pe.edu.upeu.syscasos.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.upeu.syscasos.dao.Forma_pagoDao;
import pe.edu.upeu.syscasos.entity.Forma_pago;
import pe.edu.upeu.syscasos.repository.Forma_pagoRepository;

@Component
public class Forma_pagoDaoImpl implements Forma_pagoDao {
	
	@Autowired
	private Forma_pagoRepository forma_pagoRepository;
	
	@Override
	public Forma_pago create(Forma_pago c) {
		// TODO Auto-generated method stub
		return forma_pagoRepository.save(c);
	}

	@Override
	public Forma_pago update(Forma_pago c) {
		// TODO Auto-generated method stub
		return forma_pagoRepository.save(c);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		forma_pagoRepository.deleteById(id);
	}

	@Override
	public Optional<Forma_pago> read(Long id) {
		// TODO Auto-generated method stub
		return forma_pagoRepository.findById(id);
	}

	@Override
	public List<Forma_pago> readAll() {
		// TODO Auto-generated method stub
		return forma_pagoRepository.findAll();
	}

}
