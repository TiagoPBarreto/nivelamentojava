package com.cursoandroid.primeironivelamentojava.model;

public class Cliente {
    //atributos - nome, telefone, email, idade, sexo (private)
    //construtor
    //metodos de acesso(getts and setts) - representauma ação


    private String nome; // não primitivo, especifico da linguagem
    private int idade;  // primitivo não especifico da linguagem


    //tipos de dados primitivos e não primitivos

    //getts and setts

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
