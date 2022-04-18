package com.pelada.pelada_dos_amigos.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
public class Time implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id", nullable = false)
    private Long id;

    @Column(length = 255)
    private String time_nome;

    @OneToMany(mappedBy = "time")
    private Set<Jogador> jogadores;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTime_nome() {
        return time_nome;
    }

    public void setTime_nome(String time_nome) {
        this.time_nome = time_nome;
    }

    public Set<Jogador> getJogadores() {
        return jogadores;
    }

    public void setJogadores(Set<Jogador> jogadores) {
        this.jogadores = jogadores;
    }

    @Override
    public String toString() {
        return "Time{" +
                "id=" + id +
                ", time_nome='" + time_nome + '\'' +
                ", jogadores=" + jogadores +
                '}';
    }
}
