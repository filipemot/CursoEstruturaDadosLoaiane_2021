package com.filipemota.estrturadados.teste;

import com.filipemota.estrturadados.pilha.Pilha;

public class Aula20 {

    public static void main(String[] args){
        Pilha<Integer> vetor = new Pilha<Integer>(10);
        try {
            vetor.adiciona(1);
            vetor.adiciona(2);
            vetor.adiciona(3);

            System.out.println(vetor.tamanho());
            System.out.println(vetor);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
