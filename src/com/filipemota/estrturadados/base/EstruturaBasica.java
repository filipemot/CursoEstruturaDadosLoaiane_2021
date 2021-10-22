package com.filipemota.estrturadados.base;

public class EstruturaBasica<T> {
    protected T[] elementos;
    protected int tamanho;

    public EstruturaBasica(int capacidade){
        elementos = (T[]) new Object[capacidade];
        tamanho = 0;
    }

    protected Boolean adiciona(T elemento) {
        this.aumentaCapacidade();
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }

        return false;
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

    public boolean estaVazia(){
        return tamanho == 0;
    }

    public int tamanho(){
        return this.tamanho;
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
