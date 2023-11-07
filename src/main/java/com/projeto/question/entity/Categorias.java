package com.projeto.question.entity;

public enum Categorias {

    BACKEND("Backend"),
    FRONTEND("Frontend"),
    BANCO_DADOS("Banco de dados");

    private String descricao;

    Categorias(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return this.descricao;
    }
}
