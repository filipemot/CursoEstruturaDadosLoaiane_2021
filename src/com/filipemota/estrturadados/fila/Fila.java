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
}
