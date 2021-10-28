package com.filipemota.estrturadados.teste;

import com.filipemota.estrturadados.pilha.Pilha;

import java.util.Stack;

public class Aula25 {

    public static void main(String[] args){
        Pilha<Integer> pilha = new Pilha<Integer>(10);
        try {
            System.out.println("----------------- Pilha");
            System.out.println(pilha.estaVazia());
            pilha.empilha(1);
            pilha.empilha(3);
            pilha.empilha(2);
            System.out.println(pilha);
            System.out.println(pilha.tamanho());
            System.out.println(pilha.desempilha());
            System.out.println(pilha.estaVazia());

            System.out.println("----------------- Stack Java");
            Stack<Integer> stack = new Stack<Integer>();
            System.out.println(stack.isEmpty());
            stack.push(1);
            stack.push(3);
            stack.push(2);
            System.out.println(stack);
            System.out.println(stack.size());
            System.out.println(stack.pop());
            System.out.println(stack.isEmpty());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
