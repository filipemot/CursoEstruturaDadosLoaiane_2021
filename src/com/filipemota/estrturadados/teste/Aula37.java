package com.filipemota.estrturadados.teste;

import com.filipemota.estrturadados.fila.Fila;

public class Aula37 {

    public static void main(String[] args) {
        Fila<Integer> fila = new Fila<>();

        fila.enfileira(1);
        fila.enfileira(2);
        fila.enfileira(3);
        System.out.println(fila);
        fila.desenfileira();
        System.out.println(fila);
        fila.desenfileira();
        System.out.println(fila);
    }

}
