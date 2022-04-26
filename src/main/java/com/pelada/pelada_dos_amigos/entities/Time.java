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
    private String time;

    @OneToMany(mappedBy = "time")
    private Set<Jogador> jogadores;

    public Time() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time_nome) {
        this.time = time_nome;
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
                ", time_nome='" + time + '\'' +
                ", jogadores=" + jogadores +
                '}';
    }

    public Time(Long id, String time, Set<Jogador> jogadores) {
        this.id = id;
        this.time = time;
        this.jogadores = jogadores;
    }
}
