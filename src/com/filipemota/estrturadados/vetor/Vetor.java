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
        this.aumentaCapacidade();
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }

        return false;
    }

    public void adiciona(int posicao, String elemento) {
        if(!(posicao >= 0 && posicao <tamanho)){
            throw new IllegalArgumentException("Posição Inválida");
        }

        this.aumentaCapacidade();

        for(int i=this.tamanho; i>= posicao; i--){
            this.elementos[i+1] = this.elementos[i];
        }

        this.elementos[posicao] = elemento;
        this.tamanho++;
    }

    public void remove(int posicao) {
        if(!(posicao >= 0 && posicao <tamanho)){
            throw new IllegalArgumentException("Posição Inválida");
        }

        for(int i=posicao; i<this.tamanho-1; i++){
            this.elementos[i] = this.elementos[i+1];
        }
        this.tamanho--;
    }

    public void remove(String elemento) {
        int posicao = busca(elemento);

        if(posicao > -1) {
            for (int i = posicao; i < this.tamanho - 1; i++) {
                this.elementos[i] = this.elementos[i + 1];
            }
            this.tamanho--;
        }
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

    private void aumentaCapacidade(){
        if(this.tamanho == this.elementos.length){
            String[] elementoNovos = new String[this.elementos.length * 2];

            for(int i=0; i<this.elementos.length;i++){
                elementoNovos[i] = this.elementos[i];
            }

            this.elementos = elementoNovos;
        }
    }

    public int busca(String elemento){
        for(int i=0; i<this.tamanho;i++){
            if(this.elementos[i].equals(elemento)){
                return i;
            }
        }
        return -1;
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
