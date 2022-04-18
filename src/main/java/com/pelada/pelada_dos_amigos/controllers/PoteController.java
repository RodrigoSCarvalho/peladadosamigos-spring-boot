package com.pelada.pelada_dos_amigos.controllers;

import com.pelada.pelada_dos_amigos.entities.Pote;
import com.pelada.pelada_dos_amigos.services.PoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PoteController {

    @Autowired
    private PoteService poteService;

    @GetMapping("/pote")
    public @ResponseBody
    List<Pote> getAllPotes(){
        return this.poteService.getAllPotes();
    }
}
