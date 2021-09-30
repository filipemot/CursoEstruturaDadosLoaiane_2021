package com.filipemota.estrturadados.teste;

import com.filipemota.estrturadados.vetor.Vetor;

public class Aula09 {

    public static void main(String[] args){
        Vetor vetor = new Vetor(3);
        try {
            vetor.adiciona("B");
            vetor.adiciona("C");
            vetor.adiciona("E");
            vetor.adiciona("F");
            System.out.println(vetor);
            vetor.remove(2);
            System.out.println(vetor);
            vetor.remove("F");
            System.out.println(vetor);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
