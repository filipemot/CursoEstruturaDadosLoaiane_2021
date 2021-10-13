package com.filipemota.estrturadados.teste;

import com.filipemota.estrturadados.vetor.Lista;

import java.util.ArrayList;

public class Aula17 {

    public static void main(String[] args){
        Lista vetor = new Lista(5);
        try {

            vetor.adiciona("3");
            vetor.adiciona("4");
            vetor.adiciona("5");

            System.out.println(vetor);
            vetor.limpar();
            System.out.println(vetor);

            //ultimoIndice semelhante lastIndexOf
            ArrayList<String> lista = new ArrayList<>();
            lista.add("3");
            lista.add("4");
            lista.add("5");
            System.out.println(lista);
            lista.clear();
            System.out.println(lista);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
