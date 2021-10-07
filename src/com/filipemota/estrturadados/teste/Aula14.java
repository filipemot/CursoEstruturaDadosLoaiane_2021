package com.filipemota.estrturadados.teste;

import com.filipemota.estrturadados.vetor.Lista;

import java.util.ArrayList;

public class Aula14 {

    public static void main(String[] args){
        Lista vetor = new Lista(3);
        try {

            vetor.adiciona(3);
            vetor.adiciona(4);
            vetor.adiciona(5);
            vetor.adiciona(3);

            System.out.println(vetor.ultimoIndice(3));

            //ultimoIndice semelhante lastIndexOf
            ArrayList<Integer> lista = new ArrayList<>();
            lista.add(3);
            lista.add(4);
            lista.add(5);
            lista.add(3);
            System.out.println(lista.lastIndexOf(3));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
