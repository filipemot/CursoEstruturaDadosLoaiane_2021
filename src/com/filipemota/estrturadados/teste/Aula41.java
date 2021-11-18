package com.filipemota.estrturadados.teste;

import com.filipemota.estrturadados.fila.Fila;
import com.filipemota.estrturadados.teste.objetos.Documento;
import com.filipemota.estrturadados.teste.objetos.Paciente;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Aula41 {

    public static void main(String[] args) {

        Fila<Documento> filaImpressora = new Fila<>();

        filaImpressora.enfileira(new Documento("A", 1));
        filaImpressora.enfileira(new Documento("B", 2));
        filaImpressora.enfileira(new Documento("C", 3));
        filaImpressora.enfileira(new Documento("D", 7));
        filaImpressora.enfileira(new Documento("E", 9));

        while (!filaImpressora.estaVazia()) {
            Documento doc = filaImpressora.desenfileira();
            System.out.println("Imprimindo documento " + doc.getNome());
            try {
                Thread.sleep(200 * doc.getNumFolhas());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Todos os documentos foram impressos.");
    }
}
