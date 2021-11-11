package com.filipemota.estrturadados.fila;

import com.filipemota.estrturadados.base.EstruturaBasica;

public class Fila<T> extends EstruturaBasica<T> {

    public Fila() {
        super(10);
    }

    public Fila(int capacidade) {
        super(capacidade);
    }

    public void enfileira(T elemento){
        super.adiciona(elemento);
    }

    public T espiar(){
        if(this.estaVazia()){
            return null;
        }

        return this.elementos[0];
    }

    public T desenfileira(){
        if(this.estaVazia()){
            return null;
        }

        T elemento = this.elementos[0];
        super.remove(0);

        return elemento;
    }
}
