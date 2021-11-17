package com.filipemota.estrturadados.vetor;

import com.filipemota.estrturadados.base.EstruturaEstatica;

public class Lista<T> extends EstruturaEstatica<T> {

    private T[] elementos;
    private int tamanho;

    public Lista(int capacidade) {
        super(capacidade);
    }

    public boolean adiciona(T elemento) {
        return super.adiciona(elemento);
    }

    public T obtem(int posicao) {
        return this.busca(posicao);
    }

    public boolean adiciona(int posicao, T elemento) {
        return super.adiciona(posicao, elemento);
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

    public void remove(T elemento) {
        int posicao = busca(elemento);

        if(posicao > -1) {
            this.remove(posicao);
        }
    }

    public int ultimoIndice(T elemento) {
        for(int i=this.tamanho-1; i>0;i--){
            if(this.elementos[i].equals(elemento)){
                return i;
            }
        }

        return -1;
    }

    public T busca(int posicao){
        if(!(posicao >= 0 && posicao <tamanho)){
            throw new IllegalArgumentException("Posição Inválida");
        }

        return this.elementos[posicao];
    }

    public boolean contem(T elemento){
        return busca(elemento) > -1;
    }

    public int busca(T elemento){
        for(int i=0; i<this.tamanho;i++){
            if(this.elementos[i].equals(elemento)){
                return i;
            }
        }
        return -1;
    }

    public void limpar() {
        for(int i=0; i< this.tamanho;i++){
            this.elementos[i] = null;
        }
        this.tamanho = 0;
    }
}
