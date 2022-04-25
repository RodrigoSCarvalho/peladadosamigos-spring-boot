package com.pelada.pelada_dos_amigos.services.Impl;

import com.pelada.pelada_dos_amigos.entities.Jogador;
import com.pelada.pelada_dos_amigos.entities.Pote;
import com.pelada.pelada_dos_amigos.repostiories.PoteRepository;
import com.pelada.pelada_dos_amigos.services.PoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PoteServiceImpl implements PoteService {

    @Autowired
    private PoteRepository poteRepository;

    @Override
    public List<Pote> getAllPotes() {
        return this.poteRepository.findAll();
    }

    @Override
    public Optional<Pote> findPoteByPote(String nome) {
        return this.poteRepository.findByPote(nome);
    }

    @Override
    public Optional<Pote> findPoteById(Long id) {
        return this.poteRepository.findById(id);
    }

    @Override
    public List<Jogador> findJogadoresInPote(Long id) {
        return this.poteRepository.findJogadoresInPote(id);
    }
}
