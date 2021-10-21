package com.filipemota.estrturadados.pilha;

import com.filipemota.estrturadados.base.EstruturaBasica;

public class Pilha<T> extends EstruturaBasica<T> {

    public Pilha(int capacidade) {
        super(capacidade);
    }

    public Boolean adiciona(T elemento) {
        return super.adiciona(elemento);
    }

    public void empilha(T elemento){
        super.adiciona(elemento);
    }
}
