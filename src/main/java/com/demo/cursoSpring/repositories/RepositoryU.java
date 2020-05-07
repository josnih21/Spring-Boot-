package com.demo.cursoSpring.repositories;

import com.demo.cursoSpring.entities.EntityU;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/*
* Se puede anotar como repositorio (siempre son interfaces)
* o se puede extender de clases anotadas como repositorio como
* CrudRepository
* */
@Repository
public interface RepositoryU extends CrudRepository<EntityU,Long> {
}
