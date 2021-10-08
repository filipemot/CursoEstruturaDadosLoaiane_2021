package com.filipemota.estrturadados.teste;

import com.filipemota.estrturadados.vetor.Lista;

import java.util.ArrayList;

public class Aula15 {

    public static void main(String[] args){
        Lista vetor = new Lista(5);
        try {

            vetor.adiciona("3");
            vetor.adiciona("4");
            vetor.adiciona("5");
            vetor.adiciona("3");
            vetor.remove("3");

            System.out.println(vetor);

            //ultimoIndice semelhante lastIndexOf
            ArrayList<String> lista = new ArrayList<>();
            lista.add("3");
            lista.add("4");
            lista.add("5");
            lista.add("3");
            lista.remove("3");
            System.out.println(lista);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
