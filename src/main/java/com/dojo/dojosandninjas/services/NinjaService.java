package com.dojo.dojosandninjas.services;

import com.dojo.dojosandninjas.models.Ninja;
import com.dojo.dojosandninjas.repositories.NinjaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {

    @Autowired
    NinjaRepo ninjaRepo;

    public List<Ninja> allNinjas() {
        return ninjaRepo.findAll();
    }

    public Ninja create(Ninja ninja) {
        return ninjaRepo.save(ninja);
    }

    public Ninja findNinja(Long id) {
        Optional<Ninja> optional = ninjaRepo.findById(id);
        if(optional.isPresent()) {
            return optional.get();
        } else {
            return null;
        }
    }
}
