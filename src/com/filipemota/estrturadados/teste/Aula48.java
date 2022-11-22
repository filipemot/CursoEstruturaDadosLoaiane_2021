package com.filipemota.estrturadados.teste;

import com.filipemota.estrturadados.lista.ListaEncadeada;

public class Aula48 {


    public static void main(String[] args) {

        ListaEncadeada<Integer> listaEncadeada = new ListaEncadeada<>();
        listaEncadeada.adiciona(1);
        listaEncadeada.adiciona(2);
        listaEncadeada.adiciona(3);
        listaEncadeada.adiciona(4);
        System.out.println("Tamanho = " + listaEncadeada.getTamanho());
        System.out.println(listaEncadeada);
    }
}
