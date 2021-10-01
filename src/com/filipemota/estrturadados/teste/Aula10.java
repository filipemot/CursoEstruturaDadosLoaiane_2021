package com.filipemota.estrturadados.teste;

import com.filipemota.estrturadados.vetor.Vetor;
import com.filipemota.estrturadados.vetor.VetorObjetos;

public class Aula10 {

    public static void main(String[] args){
        VetorObjetos vetor = new VetorObjetos(3);
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
