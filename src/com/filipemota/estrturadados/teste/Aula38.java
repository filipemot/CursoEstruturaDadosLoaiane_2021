package com.filipemota.estrturadados.teste;

import com.filipemota.estrturadados.fila.Fila;

import java.util.LinkedList;
import java.util.Queue;

public class Aula38 {

    public static void main(String[] args) {
        Queue<Integer> fila = new LinkedList<>();

        fila.add(1);
        fila.add(2);
        fila.add(3);
        System.out.println(fila);
        System.out.println(fila.peek());
        fila.remove();
        System.out.println(fila);
        fila.remove();
        System.out.println(fila);
    }

}
