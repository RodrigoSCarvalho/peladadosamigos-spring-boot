package com.pelada.pelada_dos_amigos.services;

import com.pelada.pelada_dos_amigos.entities.Jogador;
import com.pelada.pelada_dos_amigos.entities.Pote;

import java.util.List;
import java.util.Optional;

public interface PoteService {
    List<Pote> getAllPotes();

    Optional<Pote> findPoteByPote(String nome);

    Optional<Pote> findPoteById(Long id);

    List<Jogador> findJogadoresInPote(Long id);


}
