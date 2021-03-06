package com.pelada.pelada_dos_amigos.repostiories;

import com.pelada.pelada_dos_amigos.entities.Jogador;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface JogadorRepository extends JpaRepository<Jogador, Long> {
    Optional<Jogador> findByNome(String nome);
}