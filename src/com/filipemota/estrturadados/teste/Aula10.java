package com.filipemota.estrturadados.teste;

import com.filipemota.estrturadados.vetor.Lista;

public class Aula10 {

    public static void main(String[] args){
        Lista vetor = new Lista(3);
        try {

            Contato contato = new Contato("Nome", "Endereco", "email");

            vetor.adiciona(3);
            vetor.adiciona(4);
            vetor.adiciona(5);
            vetor.adiciona(contato);

            System.out.println(vetor);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
