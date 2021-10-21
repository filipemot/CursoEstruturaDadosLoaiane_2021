package com.filipemota.estrturadados.teste;

import com.filipemota.estrturadados.pilha.Pilha;

public class Aula20 {

    public static void main(String[] args){
        Pilha<Integer> pilha = new Pilha<Integer>(10);
        try {
            pilha.adiciona(1);
            pilha.adiciona(2);
            pilha.adiciona(3);

            System.out.println(pilha.tamanho());
            System.out.println(pilha);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
