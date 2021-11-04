package com.filipemota.estrturadados.teste;

import com.filipemota.estrturadados.teste.objetos.Livro;

import java.util.Stack;

public class Aula29 {

    public static void main(String[] args) {
        Stack<Livro> pilhaLivro = new Stack<Livro>();

        System.out.println("Pilha esta vazia:" + pilhaLivro.isEmpty());

        pilhaLivro.add(new Livro("1", "Author 01", 2021, "Title 01"));
        pilhaLivro.add(new Livro("2", "Author 02", 2021, "Title 02"));
        pilhaLivro.add(new Livro("3", "Author 03", 2021, "Title 03"));
        pilhaLivro.add(new Livro("4", "Author 04", 2021, "Title 04"));
        pilhaLivro.add(new Livro("5", "Author 05", 2021, "Title 05"));
        pilhaLivro.add(new Livro("6", "Author 06", 2021, "Title 06"));
        System.out.println("Tamanho da Pilha:" + pilhaLivro.size());

        System.out.println("Pilha esta vazia:" + pilhaLivro.isEmpty());
        System.out.println("Topo da Pìlha:" + pilhaLivro.peek());
        while(!pilhaLivro.isEmpty()){
            System.out.println("Desempilhando:" + pilhaLivro.pop());
        }
        System.out.println("Pilha esta vazia:" + pilhaLivro.isEmpty());
    }
}
