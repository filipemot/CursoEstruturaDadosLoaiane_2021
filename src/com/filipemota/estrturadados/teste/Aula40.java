package com.filipemota.estrturadados.teste;

import com.filipemota.estrturadados.fila.FilaComPrioridade;
import com.filipemota.estrturadados.teste.objetos.Paciente;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Aula40 {

    public static void main(String[] args) {
        Queue<Integer> fila = new PriorityQueue<>();

        fila.add(1);
        fila.add(3);
        fila.add(2);
        System.out.println(fila);
        Queue<Paciente> filaComPrioridade = new PriorityQueue<>(
                new Comparator<Paciente>() {
                    @Override
                    public int compare(Paciente p1, Paciente p2) {
                        return Integer.valueOf(p1.getPrioridade()).compareTo(p2.getPrioridade());
                    }
                }
        );

        filaComPrioridade.add(new Paciente("A", 2));
        filaComPrioridade.add(new Paciente("B", 1));

        System.out.println(filaComPrioridade);
    }

}
