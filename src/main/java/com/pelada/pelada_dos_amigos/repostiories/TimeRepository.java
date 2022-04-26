package com.pelada.pelada_dos_amigos.repostiories;

import com.pelada.pelada_dos_amigos.entities.Jogador;
import com.pelada.pelada_dos_amigos.entities.Time;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface TimeRepository extends JpaRepository<Time, Long> {
    Optional<Time> findByTime(String time);


    @Query(value = "SELECT t.jogadores FROM Time t WHERE t.id = :id ")
    List<Jogador> findJogadoresInTime(@Param("id") Long id);
}