package com.filipemota.estrturadados.teste;

import com.filipemota.estrturadados.fila.Fila;
import com.filipemota.estrturadados.lista.ListaEncadeada;

import java.util.Random;

public class Aula45 {


    public static void main(String[] args) {

        ListaEncadeada<Integer> listaEncadeada = new ListaEncadeada<>();
        listaEncadeada.adiciona(1);
        listaEncadeada.adiciona(2);

        System.out.println(listaEncadeada);
    }
}
