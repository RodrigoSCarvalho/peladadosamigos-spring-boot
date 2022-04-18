package com.pelada.pelada_dos_amigos.repostiories;

import com.pelada.pelada_dos_amigos.entities.Time;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TimeRepository extends JpaRepository<Time, Long> {
    Optional<Time> findByTime(String time);
}