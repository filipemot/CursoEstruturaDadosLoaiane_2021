package com.filipemota.estrturadados.teste;

import com.filipemota.estrturadados.fila.FilaComPrioridade;

import java.util.LinkedList;
import java.util.Queue;

public class Aula39 {

    public static void main(String[] args) {
        FilaComPrioridade<Integer> fila = new FilaComPrioridade<>();

        fila.enfileira(1);
        fila.enfileira(3);
        fila.enfileira(2);
        System.out.println(fila);

    }

}
