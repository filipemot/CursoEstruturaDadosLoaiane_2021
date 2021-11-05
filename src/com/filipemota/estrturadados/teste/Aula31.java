package com.filipemota.estrturadados.teste;

import com.filipemota.estrturadados.pilha.Pilha;

public class Aula31 {

    public static void main(String[] args) {
        System.out.println("A + B + (D+ C) está balanceado:" + verificaSimbolosBalanceados("A + B + (D+ C)"));
        System.out.println("A + B está balanceado:" + verificaSimbolosBalanceados("A + B "));
        System.out.println("A + B + {D+ C) está balanceado:" + verificaSimbolosBalanceados("A + B + {D+ C)"));

    }

    public static String ABRE = "([{";
    public static String FECHA = ")]}";

    public static boolean verificaSimbolosBalanceados(String expressao){
        Pilha<Character> pilha = new Pilha<>();
        for(int i = 0; i < expressao.length(); i++){
            char simbolo = expressao.charAt(i);
            if(ABRE.indexOf(simbolo) > -1){
                pilha.empilha(simbolo);
            }else if(FECHA.indexOf(simbolo) > -1){
                if(pilha.estaVazia()){
                    return false;
                }else{
                    char topo = pilha.desempilha();

                    if(ABRE.indexOf(topo) != FECHA.indexOf(simbolo)){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
