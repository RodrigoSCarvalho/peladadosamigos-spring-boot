package com.pelada.pelada_dos_amigos.controllers;

import com.pelada.pelada_dos_amigos.entities.Jogador;
import com.pelada.pelada_dos_amigos.entities.Time;
import com.pelada.pelada_dos_amigos.services.TimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
public class TimeController {
    @Autowired
    private TimeService timeService;

    @GetMapping("/time")
    public @ResponseBody
    List<Time> getAllTimes(){
        return this.timeService.getAllTimes();
    }

    @GetMapping("/time/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Optional<Time> getTimeById(@PathVariable Long id){
        return this.timeService.getTimeById(id);
    }

    @GetMapping("/time/nome/{time}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Optional<Time> getTimeByNome(@PathVariable String time){
        return this.timeService.getTimeByTime(time);
    }

    @GetMapping("time/{id}/jogadores")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public List<Jogador> getJogadoresInTime(@PathVariable Long id){
        return this.timeService.getJogadoresInTime(id);
    }
}
