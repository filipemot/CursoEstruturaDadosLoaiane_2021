package com.filipemota.estrturadados.lista;

public class ListaEncadeada<T> {

    private No<T> inicio;
    private No<T> ultimo;
    private int tamanho = 0;

    public void adiciona(T elemento){
        No<T> celula = new No<>(elemento);
        if(this.tamanho == 0) {
            this.inicio = celula;
        } else {
            this.ultimo.setProximo(celula);
        }
        this.ultimo = celula;
        this.tamanho++;
    }

    public void limpa() {

        for (No<T> atual = this.inicio; atual != null;) {
            No<T> proximo = atual.getProximo();
            atual.setElemento(null);
            atual.setProximo(null);
            atual = proximo;
        }

        this.inicio = null;
        this.ultimo = null;
        this.tamanho = 0;
    }

    public int getTamanho(){
        return this.tamanho;
    }

    @Override
    public String toString() {

        if(this.tamanho == 0){
            return "[]";
        }

        StringBuilder builder = new StringBuilder("[");
        //builder.append("Lista encadeada [inicio=").append(inicio).append("]");

        No<T> atual = this.inicio;

        for(int i = 0; i < this.tamanho -1; i++){
            builder.append(atual.getElemento()).append(",");
            atual = atual.getProximo();
        }
        builder.append(atual.getElemento()).append("]");

        return builder.toString();
    }
}
