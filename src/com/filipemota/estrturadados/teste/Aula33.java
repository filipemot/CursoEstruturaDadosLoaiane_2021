package com.filipemota.estrturadados.teste;

import com.filipemota.estrturadados.pilha.Pilha;

public class Aula33 {

    public static void main(String[] args) {
        Pilha<Integer> original = new Pilha<>();
        Pilha<Integer> dest = new Pilha<>();
        Pilha<Integer> aux = new Pilha<>();

        original.empilha(4);
        original.empilha(3);
        original.empilha(2);
        original.empilha(1);

        System.out.println(original);
        torreHanoi(4, original, dest, aux );
        System.out.println(dest);
    }
    public static void torreHanoi(int n, Pilha<Integer> origem, Pilha<Integer> destino, Pilha<Integer> auxiliar){
        if(n > 0){
            torreHanoi(n-1, origem, auxiliar, destino);
            destino.empilha(origem.desempilha());
            System.out.println("--------");
            System.out.println("Original:" + origem);
            System.out.println("Destino:" + destino);
            System.out.println("Aux:" + auxiliar);
            torreHanoi(n-1, auxiliar, destino, origem);
        }
    }
}
