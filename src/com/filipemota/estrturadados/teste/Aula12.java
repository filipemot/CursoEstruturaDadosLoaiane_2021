package com.filipemota.estrturadados.teste;

import java.util.ArrayList;

public class Aula12 {

    public static void main(String[] args){
        ArrayList<String> arrayList =  new ArrayList<>();

        arrayList.add("A");
        arrayList.add("B");

        System.out.println(arrayList);

        boolean existe = arrayList.contains("A");

        if(existe){
            System.out.println("Existe no Array");
        } else {
            System.out.println("Não existe no Array");
        }

        int pos = arrayList.indexOf("A");

        if(pos > -1){
            System.out.println("Existe no Array");
        } else {
            System.out.println("Não existe no Array");
        }

        System.out.println(arrayList.get(1));
        System.out.println("Tamanho:" + arrayList.size());

        arrayList.remove(0);
        arrayList.remove("B");

        System.out.println(arrayList);
    }
}
