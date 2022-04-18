package com.pelada.pelada_dos_amigos.controllers;

import com.pelada.pelada_dos_amigos.entities.Time;
import com.pelada.pelada_dos_amigos.services.TimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TimeController {
    @Autowired
    private TimeService timeService;

    @GetMapping("/time")
    public @ResponseBody
    List<Time> getAllTimes(){
        return this.timeService.getAllTimes();
    }
}
