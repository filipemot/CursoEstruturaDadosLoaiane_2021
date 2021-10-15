package com.filipemota.estrturadados.teste;

import com.filipemota.estrturadados.vetor.Lista;

import java.util.Scanner;

public class Aula18 {

    public static void main(String[] args){
        // Criação das variáveis
        Scanner scan = new Scanner(System.in);

        //Criar vetor com 20 de capacidade
        Lista<Contato> lista = new Lista<>(20);

        //Criar e adicionar 30 contatos
        criarContatosDinamicamente(30, lista);

        //1 - criar um menu para que o usuário escolha a opção
        int opcao = 1;

        while(opcao != 0) {
            opcao = obterOpcaoMenu(scan);

            opcaoMenu(opcao, scan, lista);
        }
        System.out.println("O Usuário digitou 0. Programa terminado!");
    }

    private static void opcaoMenu(int opcao, Scanner scan, Lista<Contato> lista){
        switch (opcao){
            case 1:
                adicionarContato(scan, lista);
                break;
            case 2:
                adicionarContatoPosicao(scan, lista);
                break;
            case 3:
                obtemContatoPosicao(scan, lista);
                break;
            case 4:
                obtemContato(scan, lista);
                break;
            case 5:
                pesquisarUltimoIndice(scan, lista);
                break;
            case 6:
                pesquisaContatoExiste(scan, lista);
                break;
            case 7:
                excluirPorPosicao(scan, lista);
                break;
            case 8:
                excluirContato(scan, lista);
                break;
            case 9:
                imprimeTamanhoLista(lista);
                break;
            case 10:
                excluirTodosContatos(lista);
                break;
            case 11:
                imprimirLista(lista);
                break;
        }
    }

    private static void imprimeTamanhoLista(Lista<Contato>lista){
        int tamanho = lista.tamanho();
        System.out.println("Tamanho da Lista:" + tamanho);
    }

    private static void excluirTodosContatos(Lista<Contato>lista){
        lista.limpar();
        System.out.println("Contatos Excluidos com Sucesso!");
    }

    private static void imprimirLista(Lista<Contato>lista){
        System.out.println("Contatos na lista:\n"+lista);
    }

    private static void obtemContatoPosicao(Scanner scan, Lista<Contato>lista){
        int pos = lerInformacaoInt("Entre com a posição a ser pesquisada",scan);

        try{
            Contato contato = lista.busca(pos);
            imprimeContato(contato, "Contato Existe, segue os dados:");
        } catch (Exception ex){
            System.out.println("Posição Inválida!");
        }
    }

    private static void obtemContato(Scanner scan, Lista<Contato>lista){
        int pos = lerInformacaoInt("Entre com a posição a ser pesquisada",scan);

        try{
            Contato contato = lista.busca(pos);
            imprimeContato(contato, "Contato Existe, segue os dados:");
            System.out.println("Fazendo pesquisa do contato encontrado");
            pos = lista.busca(contato);
            System.out.println("Contato encontrado na posição:" + pos);
        } catch (Exception ex){
            System.out.println("Posição Inválida!");
        }
    }

    private static void pesquisaContatoExiste(Scanner scan, Lista<Contato>lista){
        int pos = lerInformacaoInt("Entre com a posição a ser pesquisada",scan);

        try{
            Contato contato = lista.busca(pos);
            boolean existe = lista.contem(contato);
            if(existe) {
                imprimeContato(contato, "Contato Existe, segue os dados:");
            }
        } catch (Exception ex){
            System.out.println("Posição Inválida!");
        }
    }

    private static void excluirPorPosicao(Scanner scan, Lista<Contato>lista){
        int pos = lerInformacaoInt("Entre com a posição a ser pesquisada",scan);

        try{
            lista.remove(pos);
            System.out.println("Contato Excluído!");
        } catch (Exception ex){
            System.out.println("Posição Inválida!");
        }
    }

    private static void excluirContato(Scanner scan, Lista<Contato>lista){
        int pos = lerInformacaoInt("Entre com a posição a ser pesquisada",scan);

        try{
            Contato contato = lista.busca(pos);
            lista.remove(contato);
            System.out.println("Contato Excluído!");
        } catch (Exception ex){
            System.out.println("Posição Inválida!");
        }
    }

    private static void pesquisarUltimoIndice(Scanner scan, Lista<Contato>lista){
        int pos = lerInformacaoInt("Entre com a posição a ser pesquisada",scan);

        try{
            Contato contato = lista.busca(pos);
            imprimeContato(contato, "Contato Existe, segue os dados:");
            System.out.println("Fazendo pesquisa do contato encontrado");
            pos = lista.ultimoIndice(contato);
            System.out.println("Contato encontrado na posição:" + pos);
        } catch (Exception ex){
            System.out.println("Posição Inválida!");
        }
    }

    private static void adicionarContato(Scanner scan, Lista<Contato>lista){
        Contato contato = getContato(scan);
        lista.adiciona(contato);
        imprimeContato(contato,"Contato Adicionado com sucesso!");
    }

    private static void adicionarContatoPosicao(Scanner scan, Lista<Contato>lista){
        Contato contato = getContato(scan);
        int posicao = lerInformacaoInt("Entre com a posição a adicionar o contato :", scan);
        try {
            lista.adiciona(posicao, contato);
            imprimeContato(contato, "Contato Adicionado com sucesso!");
        } catch (Exception ex){
            System.out.println("Posição Inválida, contato não adicionado!");
        }
    }

    private static void imprimeContato(Contato contato, String msg) {
        System.out.println(msg);
        System.out.println(contato);
    }

    private static Contato getContato(Scanner scann) {
        System.out.println("Criando um contato entre com as informações");
        String nome = lerInformacao("Digite o nome:", scann);
        String telefone = lerInformacao("Digite o telefone:", scann);
        String email = lerInformacao("Digite o email:", scann);
        Contato contato = new Contato(nome, telefone, email);
        return contato;
    }

    private static String lerInformacao(String msg, Scanner scan){
        System.out.println(msg);
        String entrada = scan.nextLine();

        return entrada;
    }

    private static int lerInformacaoInt(String msg, Scanner scan){

        boolean entradaValida = false;
        int num = 0;

        while(!entradaValida){
            String entrada = lerInformacao(msg, scan);

            try {
                num = Integer.parseInt(entrada);
                entradaValida =  true;
            } catch (Exception ex){
                System.out.println("Entre com um valor válido!");
            }
        }
        return num;
    }

    private static int obterOpcaoMenu(Scanner scan){

        boolean entradaValida = false;
        int opcao = 0;
        String entrada;

        while (!entradaValida) {

            System.out.println("Digite a opção desejada");
            System.out.println("1: Adiciona contato no final do vetor");
            System.out.println("2: Adiciona contato para uma posição específica do vetor");
            System.out.println("3: Obtém contato de uma posição específica");
            System.out.println("4: Consulta contato");
            System.out.println("5: Consulta último índice do contato");
            System.out.println("6: Verifica se contato existe");
            System.out.println("7: Excluir por posição");
            System.out.println("8: Excluir contato");
            System.out.println("9: Verifica tamanho do vetor");
            System.out.println("10: Excluir todos contratos do vetor");
            System.out.println("11: Imprime vetor");
            System.out.println("0: Sair");

            try{

                entrada = scan.nextLine();
                opcao = Integer.parseInt(entrada);

                if(opcao >=0 && opcao <= 11){
                    entradaValida = true;
                } else {
                    throw new Exception();
                }
            } catch (Exception ex){
                System.out.println("Entrada inválida, digite novamente!\n\n");
            }
        }
        return opcao;
    }

    private static void criarContatosDinamicamente(int quantidade, Lista<Contato> lista){
        Contato contato;
        for(int i=1; i<= quantidade;i++){
            contato = new Contato("Contato " + i, "11111111111 " + i, "contato" + i + "@email.com");
            lista.adiciona(contato);
        }
    }
}
