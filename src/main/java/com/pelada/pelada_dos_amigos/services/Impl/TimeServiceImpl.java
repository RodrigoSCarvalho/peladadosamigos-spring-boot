package com.pelada.pelada_dos_amigos.services.Impl;


import com.pelada.pelada_dos_amigos.entities.Time;
import com.pelada.pelada_dos_amigos.repostiories.TimeRepository;
import com.pelada.pelada_dos_amigos.services.TimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TimeServiceImpl implements TimeService {

    @Autowired
    private TimeRepository timeRepository;

    @Override
    public List<Time> getAllTimes() {
        return this.timeRepository.findAll();
    }
}
