package com.dojo.dojosandninjas.controllers;

import com.dojo.dojosandninjas.models.Dojo;
import com.dojo.dojosandninjas.models.Ninja;
import com.dojo.dojosandninjas.services.DojoService;
import com.dojo.dojosandninjas.services.NinjaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
public class MainController {

    @Autowired
    DojoService dojoService;

    @Autowired
    NinjaService ninjaService;

    @RequestMapping("/")
    public String indexx(){
        return "redirect:/new/dojos";
    }

    @GetMapping("/all")
    public String index(Model model){
        List<Dojo> dojosList = dojoService.allDojos();
        model.addAttribute("dojo", dojosList);

        return "index.jsp";
    }

    @GetMapping("/new/dojos")
    public String dojos(@ModelAttribute("dojo") Dojo dojo, Model model){
        List<Dojo> dojos = dojoService.allDojos();
        model.addAttribute("dojos" , dojos);
        return "new_dojo.jsp";
    }

    @GetMapping("/new/ninjas")
    public String ninjas(@ModelAttribute("ninja") Ninja ninja, Model model){
        List<Ninja> ninjas = ninjaService.allNinjas();
        List<Dojo> dojos = dojoService.allDojos();

        model.addAttribute("ninjas", ninjas);
        model.addAttribute("dojo", dojos);

        return "new_ninja.jsp";
    }

    @GetMapping("/ninjas/{id}")
    public String ninjas(@PathVariable("id") Long id, Model model){
        List<Ninja> ninjas = ninjaService.allNinjas();
        Dojo dojo = dojoService.findDojo(id);

        model.addAttribute("ninjas", ninjas);
        model.addAttribute("dojo", dojo);

        return "show.jsp";
    }

    @PostMapping("/dojos")
    public String postDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result){
        if (result.hasErrors()){
            return "new_dojo.jsp";
        }
        dojoService.create(dojo);
        return "redirect:/new/ninjas";
    }

    @PostMapping("/ninjas")
    public String postNinja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result){
        if (result.hasErrors()){
            return "new_dojo.jsp";
        }
        ninjaService.create(ninja);
        return "redirect:/ninjas/" + ninja.getDojo().getId();
    }

}
