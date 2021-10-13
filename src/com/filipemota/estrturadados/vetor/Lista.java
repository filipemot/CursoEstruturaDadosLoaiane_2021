package com.filipemota.estrturadados.vetor;

public class Lista<T> {

    private T[] elementos;
    private int tamanho;

    public Lista(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }

    public Boolean adiciona(T elemento) {
        this.aumentaCapacidade();
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }

        return false;
    }

    public T obtem(int posicao) {
        return this.busca(posicao);
    }
    public void adiciona(int posicao, T elemento) {
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

    public int tamanho() {
        return this.tamanho;
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

    private void aumentaCapacidade(){
        if(this.tamanho == this.elementos.length){
            T[] elementoNovos = (T[]) new Object[this.elementos.length * 2];

            for(int i=0; i<this.elementos.length;i++){
                elementoNovos[i] = this.elementos[i];
            }

            this.elementos = elementoNovos;
        }
    }

    public int busca(T elemento){
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

    public void limpar() {
        for(int i=0; i< this.tamanho;i++){
            this.elementos[i] = null;
        }
        this.tamanho = 0;
    }
}
