package com.filipemota.estrturadados.teste;

import com.filipemota.estrturadados.pilha.Pilha;

public class Aula32 {

    public static void main(String[] args) {
        System.out.println("25 em binário é:" + converterParaQualquerBase(25,2));
        System.out.println("2 em binário é:" + converterParaQualquerBase(2,2));
        System.out.println("4 em binário é:" + converterParaQualquerBase(4,2));
        System.out.println("10 em binário é:" + converterParaQualquerBase(10,2));
        System.out.println("10035 em octal é:" + converterParaQualquerBase(10035,8));
        System.out.println("16 em hexadecimal é:" + converterParaQualquerBase(16,16));
    }

    public static String converterParaQualquerBase(int numero, int base){

        if(base < 2 || base > 16){
            throw new IllegalArgumentException("A base deve ser entre 2 e 16");
        }

        Pilha<Integer> pilha = new Pilha<>();
        String numeroBinario = "";
        int resto;
        String bases = "0123456789ABCDEF";
        while(numero > 0){
            resto = numero % base;
            pilha.empilha(resto);
            numero /= base;
        }
        while (!pilha.estaVazia()){
            numeroBinario += bases.charAt(pilha.desempilha());
        }

        return numeroBinario;
    }

}
