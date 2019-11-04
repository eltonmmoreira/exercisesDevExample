package com.devBootCamp.exercicio6.usuario;

import com.devBootCamp.exercicio6.crud.BaseObject;

public class Usuario extends BaseObject {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
