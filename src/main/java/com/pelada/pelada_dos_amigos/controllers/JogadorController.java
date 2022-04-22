package com.pelada.pelada_dos_amigos.controllers;

import com.pelada.pelada_dos_amigos.entities.Jogador;
import com.pelada.pelada_dos_amigos.services.JogadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class JogadorController {

    @Autowired
    private JogadorService jogadorService;

    @GetMapping("/jogador")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public @ResponseBody
    List<Jogador> getAllJogadores(){
        return this.jogadorService.getAllJogadores();
    }

    @GetMapping("/jogador/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Optional<Jogador> getJogadorById(@PathVariable long id){
        return this.jogadorService.findJogadorById(id);
    }
    @RequestMapping( method = RequestMethod.GET )
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Optional<Jogador> getJogadorByNome(@RequestParam(value = "nome") String nome){
        return this.jogadorService.findJogadorByNome(nome);
    }

    //************** POST ****************

    @PostMapping("/jogador")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity addNewJogador(@RequestBody Jogador jogador){
        this.jogadorService.addNewJogador(jogador);
        return new ResponseEntity<>(jogador, HttpStatus.CREATED);
    }
}
