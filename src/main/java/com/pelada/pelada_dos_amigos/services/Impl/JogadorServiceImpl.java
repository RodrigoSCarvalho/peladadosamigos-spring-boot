package com.pelada.pelada_dos_amigos.services.Impl;

import com.pelada.pelada_dos_amigos.entities.Jogador;
import com.pelada.pelada_dos_amigos.repostiories.JogadorRepository;
import com.pelada.pelada_dos_amigos.services.JogadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JogadorServiceImpl implements JogadorService {

    @Autowired
    private JogadorRepository jogadorRepository;

    @Override
    public List<Jogador> getAllJogadores() {
        return this.jogadorRepository.findAll();
    }

    @Override
    public Optional<Jogador> findJogadorById(long id) {
        return this.jogadorRepository.findById(id);
    }

    @Override
    public Optional<Jogador> findJogadorByNome(String nome) {
        return this.jogadorRepository.findByNome(nome);
    }

    @Override
    public void addNewJogador(Jogador jogador) {
        this.jogadorRepository.save(jogador);
    }

    @Override
    public void updateJogador(long id, Jogador jogador) {
        jogadorRepository.findById(id).map(jogadorExistente -> {
            jogadorExistente.setNome(jogador.getNome());
            jogadorExistente.setPote(jogador.getPote());
            jogadorExistente.setTime(jogador.getTime());
            return jogadorRepository.save(jogadorExistente);
        });
    }
}
