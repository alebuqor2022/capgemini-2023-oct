package com.capgemini.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.capgemini.model.Curso;
import com.capgemini.repository.CursoRepository;

@Service
public class CursoServiceImp implements CursoService{
	@Autowired
	private CursoRepository cursoRepository;

	@Override
	public Curso getCursoById(long id) {
		Optional<Curso> optionalCurso=this.cursoRepository.findById(id);
		Curso curso=null;
		if(optionalCurso.isPresent()) {
			curso=optionalCurso.get();
		}else {
			throw new RuntimeException("el curso no se encuentra, su nro es: " + id);
		}
		return curso;
	}

	@Override
	public List<Curso> getAllCursos() {
		return this.cursoRepository.findAll();
	}

	@Override
	public void saveCurso(Curso c) {
		this.cursoRepository.save(c);
		
	}

	@Override
	public void deleteCursoById(long id) {
		this.cursoRepository.deleteById(id);
		
	}

	@Override
	public Page<Curso> findPaginated(int pageNum, int pageSize, 
			String sortField, String sortDirection) {
		// if reducido --> variable = logica ? true : false 
		Sort sort=sortDirection.equalsIgnoreCase(Sort.Direction.ASC.name())?
				    Sort.by(sortField).ascending():
					Sort.by(sortField).descending();
					
		Pageable pageable=PageRequest.of(pageNum -1, pageSize, sort);
		
		return this.cursoRepository.findAll(pageable);
	}

}
