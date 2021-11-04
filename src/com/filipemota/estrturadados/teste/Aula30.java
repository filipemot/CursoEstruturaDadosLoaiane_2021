package com.filipemota.estrturadados.teste;

import com.filipemota.estrturadados.pilha.Pilha;

import java.util.Stack;

public class Aula30 {

    public static void main(String[] args) {
        System.out.println("ADA é palindromo:" + testePalindromo("ADA"));
        System.out.println("ABCD é palindromo:" + testePalindromo("ABCD"));
        System.out.println("ABCCBA é palindromo:" + testePalindromo("ABCCBA"));
    }

    public static boolean testePalindromo(String palavra) {
        Pilha<Character> pilha = new Pilha<>();
        for (int i = 0; i < palavra.length(); i++) {
            pilha.empilha(palavra.charAt(i));
        }
        for (int i = 0; i < palavra.length(); i++) {
            if (pilha.desempilha() != palavra.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
