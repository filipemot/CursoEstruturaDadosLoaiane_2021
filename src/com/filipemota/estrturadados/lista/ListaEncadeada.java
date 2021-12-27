package com.filipemota.estrturadados.lista;

public class ListaEncadeada<T> {

    private No<T> inicio;
    private int tamanho = 0;

    public void adiciona(T elemento){
        No<T> novo = new No<>(elemento);
        if(this.inicio == null){
            this.inicio = novo;
        }else{
            No<T> aux = inicio;
            while(aux.getProximo() != null){
                aux = aux.getProximo();
            }
            aux.setProximo(novo);
        }
        this.tamanho++;
    }

    public int getTamanho(){
        return this.tamanho;
    }

    @Override
    public String toString() {
        return "ListaEncadeada{" +
                "inicio=" + inicio +
                '}';
    }
}
