package com.dojo.dojosandninjas.services;

import com.dojo.dojosandninjas.models.Dojo;
import com.dojo.dojosandninjas.repositories.DojoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DojoService {

    @Autowired
    DojoRepo dojoRepo;

    public List<Dojo> allDojos() {
        return dojoRepo.findAll();
    }

    public Dojo create(Dojo dojo) {
        return dojoRepo.save(dojo);
    }

    public Dojo findDojo(Long id) {
        Optional<Dojo> optional = dojoRepo.findById(id);
        if(optional.isPresent()) {
            return optional.get();
        } else {
            return null;
        }
    }
}
