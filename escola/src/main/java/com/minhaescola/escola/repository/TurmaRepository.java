package com.minhaescola.escola.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.minhaescola.escola.model.TurmaModel;

public interface TurmaRepository extends JpaRepository<TurmaModel, Long> {

}
