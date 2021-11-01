package com.filipemota.estrturadados.teste;

import com.filipemota.estrturadados.pilha.Pilha;

import java.util.Scanner;

public class Aula27 {

    public static void main(String[] args) {
        Pilha<Integer> pilhaPar = new Pilha<Integer>();
        Pilha<Integer> pilhaImpar = new Pilha<Integer>();

        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            System.out.println("Entre com um número:");
            int num = scanner.nextInt();
            if (num == 0) {
                Integer desempilhadoPar = pilhaPar.desempilha();
                Integer desempilhadoImpar = pilhaImpar.desempilha();

                if (desempilhadoPar == null) {
                    System.out.println("Pilha par vazia");
                } else {
                    System.out.println("Desempilhando da pilha par:" + desempilhadoPar);
                }

                if (desempilhadoImpar == null) {
                    System.out.println("Pilha impar vazia");
                } else {
                    System.out.println("Desempilhando da pilha impar:" + desempilhadoImpar);
                }

            } else if (num % 2 == 0) {
                System.out.println("Empilha o numero par:" + num);
                pilhaPar.empilha(num);
            } else {
                System.out.println("Empilha o numero impar:" + num);
                pilhaImpar.empilha(num);
            }
        }
        System.out.println("Esvaziando Pilha");
        while (!pilhaPar.estaVazia()) {
            System.out.println("Desempilhando Par:" + pilhaPar.desempilha());
        }

        while (!pilhaImpar.estaVazia()) {
            System.out.println("Desempilhando Impar:" + pilhaImpar.desempilha());
        }
        System.out.println("Pilha Vazia");
    }
}
