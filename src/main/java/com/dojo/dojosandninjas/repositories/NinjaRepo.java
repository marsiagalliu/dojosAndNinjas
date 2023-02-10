package com.dojo.dojosandninjas.repositories;

import com.dojo.dojosandninjas.models.Ninja;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NinjaRepo extends CrudRepository<Ninja, Long> {

    List<Ninja> findAll();

    List<Ninja> findNinjaById(Long id);

}
