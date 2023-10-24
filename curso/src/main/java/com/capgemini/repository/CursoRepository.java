package com.capgemini.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.model.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long>{

}
