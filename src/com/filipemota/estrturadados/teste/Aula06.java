package com.filipemota.estrturadados.teste;

import com.filipemota.estrturadados.vetor.Vetor;

public class Aula06 {

    public static void main(String[] args){
        Vetor vetor = new Vetor(10);
        try {
            vetor.adiciona("Elemento 1");
            vetor.adiciona("Elemento 2");
            vetor.adiciona("Elemento 3");

            System.out.println(vetor.busca("Elemento 3"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
