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

    private String nome;

    @ManyToOne
    @JoinColumn(name="pote_id")
    private Pote pote;

    @ManyToOne
    @JoinColumn(name = "time_id")
    private Time time;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pote getPote() {
        return pote;
    }

    public void setPote(Pote pote) {
        this.pote = pote;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Jogador{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", pote=" + pote +
                ", time=" + time +
                '}';
    }
}
