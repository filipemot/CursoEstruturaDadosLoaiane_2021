package com.filipemota.estrturadados.teste;

import com.filipemota.estrturadados.fila.Fila;
import com.filipemota.estrturadados.fila.FilaComPrioridade;
import com.filipemota.estrturadados.teste.objetos.PSAtendimento;
import com.filipemota.estrturadados.teste.objetos.PSNovosPacientes;
import com.filipemota.estrturadados.teste.objetos.Pessoa;

public class Aula43 {


    public static final int VERDE = 2;
    public static final int AMARELO = 1;
    public static final int VERMELHO = 0;

    public static void main(String[] args) {

        FilaComPrioridade<Pessoa> fila = new FilaComPrioridade<>();
        fila.enfileira(new Pessoa("1", VERDE));
        fila.enfileira(new Pessoa("2", AMARELO));
        fila.enfileira(new Pessoa("3", VERMELHO));
        fila.enfileira(new Pessoa("4", VERDE));
        fila.enfileira(new Pessoa("5", VERDE));
        fila.enfileira(new Pessoa("6", VERMELHO));

        PSAtendimento atendimento = new PSAtendimento(fila);
        PSNovosPacientes pacientes = new PSNovosPacientes(fila);

        Thread t1 = new Thread(atendimento);
        Thread t2 = new Thread(pacientes);

        t1.start();
        t2.start();
    }
}
