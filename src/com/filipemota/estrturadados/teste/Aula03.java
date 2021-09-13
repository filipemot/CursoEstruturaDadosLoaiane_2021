package com.filipemota.estrturadados.teste;

import com.filipemota.estrturadados.vetor.Vetor;

public class Aula03 {

    public static void main(String[] args){
        Vetor vetor = new Vetor(2);
        try {
            vetor.adiciona("Elemento 1");
            vetor.adiciona("Elemento 2");
            vetor.adiciona("Elemento 3");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
