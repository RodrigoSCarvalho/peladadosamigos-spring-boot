package com.pelada.pelada_dos_amigos.controllers;

import com.pelada.pelada_dos_amigos.entities.Jogador;
import com.pelada.pelada_dos_amigos.entities.Pote;
import com.pelada.pelada_dos_amigos.services.PoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import static org.springframework.http.HttpStatus.ACCEPTED;

@RestController
public class PoteController {

    @Autowired
    private PoteService poteService;

    @GetMapping("/pote")
    @ResponseStatus(ACCEPTED)
    public @ResponseBody
    List<Pote> getAllPotes(){
        return this.poteService.getAllPotes();
    }

    @GetMapping("/pote/{id}")
    @ResponseStatus(ACCEPTED)
    public Optional<Pote> findPoteById(@PathVariable long id){
        return this.poteService.findPoteById(id);
    }

    @GetMapping("/pote/nome/{pote}")
    public Optional<Pote> findPoteByPote(@PathVariable String pote){
        return this.poteService.findPoteByPote(pote);
    }

    @GetMapping("pote/{id}/jogadores")
    public List<Jogador> findJogadoresInPote(@PathVariable Long id) { return this.poteService.findJogadoresInPote(id);}
}
