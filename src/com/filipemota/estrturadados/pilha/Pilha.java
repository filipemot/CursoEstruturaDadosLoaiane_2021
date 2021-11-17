package com.filipemota.estrturadados.pilha;

import com.filipemota.estrturadados.base.EstruturaBasica;

public class Pilha<T> extends EstruturaBasica<T> {

    public Pilha() {
        super(10);
    }

    public Pilha(int capacidade) {
        super(capacidade);
    }

    public boolean adiciona(T elemento) {
        return super.adiciona(elemento);
    }

    public void empilha(T elemento){
        super.adiciona(elemento);
    }

    public T topo(){
        if(this.estaVazia()){
            return null;
        }

        return elementos[tamanho-1];
    }

    public T desempilha(){
        if(this.estaVazia()){
            return null;
        }
        return this.elementos[--tamanho];
    }
}
