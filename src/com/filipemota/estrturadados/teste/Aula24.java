package com.filipemota.estrturadados.teste;

import com.filipemota.estrturadados.pilha.Pilha;

public class Aula24 {

    public static void main(String[] args){
        Pilha<Integer> pilha = new Pilha<Integer>(10);
        try {
            System.out.println(pilha.estaVazia());
            pilha.empilha(1);
            pilha.empilha(3);
            pilha.empilha(2);
            System.out.println(pilha);
            System.out.println(pilha.desempilha());
            System.out.println(pilha);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
