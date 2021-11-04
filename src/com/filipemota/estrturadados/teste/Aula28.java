package com.filipemota.estrturadados.teste;

import com.filipemota.estrturadados.pilha.Pilha;
import com.filipemota.estrturadados.teste.objetos.Livro;

public class Aula28 {

    public static void main(String[] args) {
        Pilha<Livro> pilhaLivro = new Pilha<Livro>(6);

        System.out.println("Pilha esta vazia:" + pilhaLivro.estaVazia());

        pilhaLivro.empilha(new Livro("1", "Author 01", 2021, "Title 01"));
        pilhaLivro.empilha(new Livro("2", "Author 02", 2021, "Title 02"));
        pilhaLivro.empilha(new Livro("3", "Author 03", 2021, "Title 03"));
        pilhaLivro.empilha(new Livro("4", "Author 04", 2021, "Title 04"));
        pilhaLivro.empilha(new Livro("5", "Author 05", 2021, "Title 05"));
        pilhaLivro.empilha(new Livro("6", "Author 06", 2021, "Title 06"));
        System.out.println("Tamanho da Pilha:" + pilhaLivro.tamanho());

        System.out.println("Pilha esta vazia:" + pilhaLivro.estaVazia());
        System.out.println("Topo da Pìlha:" + pilhaLivro.topo());
        while(!pilhaLivro.estaVazia()){
            System.out.println("Desempilhando:" + pilhaLivro.desempilha());
        }
        System.out.println("Pilha esta vazia:" + pilhaLivro.estaVazia());
    }
}
