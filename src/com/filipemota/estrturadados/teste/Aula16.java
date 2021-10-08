package com.filipemota.estrturadados.teste;

import com.filipemota.estrturadados.vetor.Lista;

import java.util.ArrayList;

public class Aula16 {

    public static void main(String[] args){
        Lista vetor = new Lista(5);
        try {

            vetor.adiciona("3");
            vetor.adiciona("4");
            vetor.adiciona("5");

            System.out.println(vetor.obtem(0));

            //ultimoIndice semelhante lastIndexOf
            ArrayList<String> lista = new ArrayList<>();
            lista.add("3");
            lista.add("4");
            lista.add("5");

            System.out.println(lista.get(0));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
