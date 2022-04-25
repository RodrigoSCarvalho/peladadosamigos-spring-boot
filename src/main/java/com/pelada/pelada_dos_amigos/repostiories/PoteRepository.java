package com.pelada.pelada_dos_amigos.repostiories;

import com.pelada.pelada_dos_amigos.entities.Jogador;
import com.pelada.pelada_dos_amigos.entities.Pote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface PoteRepository extends JpaRepository<Pote, Long> {

    Optional<Pote> findByPote(String nome);

    @Query( value = "SELECT p.jogadores FROM Pote p WHERE p.id = :id")
    List<Jogador> findJogadoresInPote(@Param("id") Long id);
}