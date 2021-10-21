package com.filipemota.estrturadados.teste;

import com.filipemota.estrturadados.pilha.Pilha;

public class Aula21 {

    public static void main(String[] args){
        Pilha<Integer> pilha = new Pilha<Integer>(10);
        try {
            pilha.empilha(1);
            pilha.empilha(2);
            pilha.empilha(3);

            System.out.println(pilha.tamanho());
            System.out.println(pilha);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
