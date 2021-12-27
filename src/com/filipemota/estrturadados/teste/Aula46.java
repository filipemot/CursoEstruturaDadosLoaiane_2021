package com.filipemota.estrturadados.teste;

import com.filipemota.estrturadados.lista.ListaEncadeada;

public class Aula46 {


    public static void main(String[] args) {

        ListaEncadeada<Integer> listaEncadeada = new ListaEncadeada<>();
        listaEncadeada.adiciona(1);
        listaEncadeada.adiciona(2);

        System.out.println(listaEncadeada);
        System.out.println(listaEncadeada.getTamanho());

    }
}
