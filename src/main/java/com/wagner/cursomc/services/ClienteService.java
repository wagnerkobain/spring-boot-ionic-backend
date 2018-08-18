package com.wagner.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wagner.cursomc.domain.Cliente;
import com.wagner.cursomc.repositories.ClienteRepository;
import com.wagner.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {
	
	@Autowired
	ClienteRepository repo;
	
	public Cliente buscar(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(()-> new ObjectNotFoundException("Objeto não encontrado! Id: "+id
				+", Tipo: "+Cliente.class.getName()));
	}
	
	
}