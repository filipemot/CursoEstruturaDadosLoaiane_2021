package com.filipemota.estrturadados.teste;

import com.filipemota.estrturadados.pilha.Pilha;

import java.util.Scanner;
import java.util.Stack;

public class Aula26 {

    public static void main(String[] args){
        Pilha<Integer> pilha = new Pilha<Integer>();
        Scanner scanner = new Scanner(System.in);

        for(int i=1; i<=10; i++){
            System.out.println("Entre com um número:");
            int num = scanner.nextInt();
            if(num %2 == 0){
                System.out.println("Empilha o numero :" + num);
                pilha.empilha(num);
            } else {
                Integer desempilhado = pilha.desempilha();
                if(desempilhado == null) {
                    System.out.println("Pilha está vazia");
                } else {
                    System.out.println("Número impar, desimpilhando  um elemento da pilha: " + desempilhado);
                }
            }
        }
        System.out.println("Esvaziando Pilha");
        while (!pilha.estaVazia()){
            System.out.println("Desempilhando:" + pilha.desempilha());
        }
        System.out.println("Pilha Vazia");
    }
}
