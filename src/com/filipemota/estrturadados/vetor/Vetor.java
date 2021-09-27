package com.filipemota.estrturadados.vetor;

import java.util.Arrays;

public class Vetor {

    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    public Boolean adiciona(String elemento) {
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }

        return false;
    }

    public int tamanho() {
        return this.tamanho;
    }

    public String busca(int posicao){
        if(!(posicao >= 0 && posicao <tamanho)){
            throw new IllegalArgumentException("Posição Inválida");
        }

        return this.elementos[posicao];
    }

    @Override
    public String toString() {
        StringBuilder str =  new StringBuilder();
        str.append("[");

        for(int i=0; i <this.tamanho-1;i++){
            str.append(this.elementos[i]);
            str.append(", ");
        }

        if(this.tamanho > 0){
            str.append(this.elementos[this.tamanho -1]);
        }

        str.append("]");
        return str.toString();
    }
}
