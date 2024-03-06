package com.site.chocolate.Controller;

import com.site.chocolate.Model.Chocolate;
import com.site.chocolate.Repository.ChocolateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/")
public class ChocolateController {
    @Autowired
    ChocolateRepository repository;
    @GetMapping(value = "/chocolate")
    public List<Chocolate> buscar() {
        return repository.findAll();
    }
    //GET por ID
    @GetMapping(value = "/{id}")
    public Chocolate buscarId(@PathVariable Long id) {
        Chocolate result = repository.findById(id).get();
        return result;
    }
    //POST
    @PostMapping
    public Chocolate novoChocolate(@RequestBody Chocolate chocolate) {
        Chocolate result = repository.save(chocolate);
        return result;
    }
}
