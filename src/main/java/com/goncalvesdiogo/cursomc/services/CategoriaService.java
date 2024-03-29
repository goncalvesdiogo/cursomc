package com.goncalvesdiogo.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.goncalvesdiogo.cursomc.domain.Categoria;
import com.goncalvesdiogo.cursomc.repositories.CategoriaRepository;
import com.goncalvesdiogo.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;

	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrando! Id: " + id + ", Tipo: " + Categoria.class.getName()));
	}
}
