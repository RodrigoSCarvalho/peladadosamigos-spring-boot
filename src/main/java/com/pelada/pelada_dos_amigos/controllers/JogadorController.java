package com.pelada.pelada_dos_amigos.controllers;

import com.pelada.pelada_dos_amigos.entities.Jogador;
import com.pelada.pelada_dos_amigos.services.JogadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JogadorController {

    @Autowired
    private JogadorService jogadorService;

    @GetMapping
    public @ResponseBody
    List<Jogador> getAllJogadores(){
        return this.jogadorService.getAllJogadores();
    }
}
