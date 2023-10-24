package com.capgemini.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.capgemini.model.Curso;

public interface CursoService {

	Curso getCursoById(long id);
	List<Curso> getAllCursos();
	void saveCurso(Curso c);
	void deleteCursoById(long id);
	
	Page<Curso> findPaginated(int pageNum, int pageSize, String sortField, String sortDirection);
	
}
