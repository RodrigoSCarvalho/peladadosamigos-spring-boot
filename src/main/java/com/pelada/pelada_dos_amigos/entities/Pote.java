package com.pelada.pelada_dos_amigos.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
public class Pote implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(length = 255)
    private String pote_nome;

    @OneToMany(mappedBy = "pote")
    private Set<Jogador> jogadores;

    public Pote() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPoteNome() {
        return pote_nome;
    }

    public void setPoteNome(String pote) {
        this.pote_nome = pote;
    }

    public Set<Jogador> getJogadores() {
        return jogadores;
    }

    public void setJogadores(Set<Jogador> jogadores) {
        this.jogadores = jogadores;
    }

    @Override
    public String toString() {
        return "Pote{" +
                "id=" + id +
                ", pote='" + pote_nome + '\'' +
                ", jogadores=" + jogadores +
                '}';
    }
}
