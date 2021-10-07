package com.filipemota.estrturadados.teste;

import com.filipemota.estrturadados.vetor.Lista;

import java.util.ArrayList;

public class Aula13 {

    public static void main(String[] args){
        Lista vetor = new Lista(3);
        try {

            vetor.adiciona(3);
            vetor.adiciona(4);
            vetor.adiciona(5);

            System.out.println(vetor.contem(4));
            System.out.println(vetor.contem(8));

            //contem semelhante contains
            ArrayList<Integer> lista = new ArrayList<>();
            lista.add(3);
            lista.add(4);
            lista.add(5);
            System.out.println(lista.contains(4));
            System.out.println(lista.contains(8));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
