package com.pelada.pelada_dos_amigos.repostiories;

import com.pelada.pelada_dos_amigos.entities.Pote;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PoteRepository extends JpaRepository<Pote, Long> {

    Optional<Pote> findByPote(String nome);
}