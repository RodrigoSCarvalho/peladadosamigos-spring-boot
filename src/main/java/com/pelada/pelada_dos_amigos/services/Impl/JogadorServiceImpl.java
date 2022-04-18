package com.pelada.pelada_dos_amigos.services.Impl;

import com.pelada.pelada_dos_amigos.entities.Jogador;
import com.pelada.pelada_dos_amigos.repostiories.JogadorRepository;
import com.pelada.pelada_dos_amigos.services.JogadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JogadorServiceImpl implements JogadorService {

    @Autowired
    private JogadorRepository jogadorRepository;

    @Override
    public List<Jogador> getAllJogadores() {
        return this.jogadorRepository.findAll();
    }
}
