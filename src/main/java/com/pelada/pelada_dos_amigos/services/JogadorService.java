package com.pelada.pelada_dos_amigos.services;

import com.pelada.pelada_dos_amigos.entities.Jogador;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface JogadorService {
    List<Jogador> getAllJogadores();

    Optional<Jogador> findJogadorById(long id);

    Optional<Jogador> findJogadorByNome(String nome);

    void addNewJogador(Jogador jogador);

    void updateJogador(long id, Jogador jogador);
}
