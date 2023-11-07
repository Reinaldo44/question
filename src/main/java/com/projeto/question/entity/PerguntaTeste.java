package com.projeto.question.entity;


import jakarta.persistence.*;

@Entity
public class PerguntaTeste {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descricao;

    @Enumerated(EnumType.STRING)
    private Categorias categorias;

    public PerguntaTeste() {
    }

    public PerguntaTeste(Long id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return descricao;
    }

    public void setNome(String nome) {
        this.descricao = nome;
    }
}

