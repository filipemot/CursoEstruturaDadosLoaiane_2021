package com.filipemota.estrturadados.teste;

import com.filipemota.estrturadados.vetor.Lista;

public class Aula11 {

    public static void main(String[] args){
        Lista vetor = new Lista(3);
        try {

            vetor.adiciona(3);
            vetor.adiciona(4);
            vetor.adiciona(5);

            System.out.println(vetor);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
