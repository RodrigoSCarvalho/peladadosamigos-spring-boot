package com.pelada.pelada_dos_amigos.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Jogador implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id", nullable = false)
    private Long id;

    private String nome_jogador;

    @ManyToOne
    @JoinColumn(name="pote_id")
    private Pote pote;

    @ManyToOne
    @JoinColumn(name = "time_id")
    private Time time;
}
