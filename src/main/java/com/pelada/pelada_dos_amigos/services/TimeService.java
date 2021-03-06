package com.pelada.pelada_dos_amigos.services;

import com.pelada.pelada_dos_amigos.entities.Jogador;
import com.pelada.pelada_dos_amigos.entities.Time;

import java.util.List;
import java.util.Optional;

public interface TimeService {
    List<Time> getAllTimes();

    Optional<Time> getTimeById(Long id);

    Optional<Time> getTimeByTime(String time);

    List<Jogador> getJogadoresInTime(Long id);
}
