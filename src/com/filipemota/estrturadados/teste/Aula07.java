package com.filipemota.estrturadados.teste;

import com.filipemota.estrturadados.vetor.Vetor;

public class Aula07 {

    public static void main(String[] args){
        Vetor vetor = new Vetor(10);
        try {
            vetor.adiciona("B");
            vetor.adiciona("C");
            vetor.adiciona("E");
            vetor.adiciona("F");
            System.out.println(vetor.toString());
            vetor.adiciona(0, "A");
            System.out.println(vetor.toString());
            vetor.adiciona(3, "D");
            System.out.println(vetor.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
