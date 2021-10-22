package com.filipemota.estrturadados.teste;

import com.filipemota.estrturadados.pilha.Pilha;

public class Aula22 {

    public static void main(String[] args){
        Pilha<Integer> pilha = new Pilha<Integer>(10);
        try {
            System.out.println(pilha.estaVazia());
            pilha.empilha(1);
            System.out.println(pilha);
            System.out.println(pilha.estaVazia());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
