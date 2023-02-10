package com.dojo.dojosandninjas.repositories;

import com.dojo.dojosandninjas.models.Dojo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DojoRepo extends CrudRepository<Dojo, Long> {

    List<Dojo> findAll();

    List<Dojo> findDojoById(Long id);
}
