package com.filipemota.estrturadados.teste;

import com.filipemota.estrturadados.fila.Fila;

public class Aula36 {

    public static void main(String[] args) {
        Fila<Integer> fila = new Fila<>();

        fila.enfileira(1);
        fila.enfileira(2);
        System.out.println(fila);
        System.out.println(fila.espiar());
    }

}
