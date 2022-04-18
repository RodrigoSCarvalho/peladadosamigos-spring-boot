package com.pelada.pelada_dos_amigos.services;

import com.pelada.pelada_dos_amigos.entities.Jogador;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface JogadorService {
    List<Jogador> getAllJogadores();
}
