package com.filipemota.estrturadados.teste;

import com.filipemota.estrturadados.fila.Fila;

public class Aula35 {

    public static void main(String[] args) {
        Fila<Integer> fila = new Fila<>();

        System.out.println(fila.estaVazia());

        fila.enfileira(1);
        fila.enfileira(2);
        System.out.println(fila);
        System.out.println(fila.tamanho());
    }

}
