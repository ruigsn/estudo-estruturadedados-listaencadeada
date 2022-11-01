package com.rui.estruturadedados.listaencadeada;

public class ListaEncadeadaTeste {
    public static void main(String[] args) {

        ListaEncadeada lista = new ListaEncadeada();
        System.out.println(lista);

        lista.adicionaInicio(4);
        System.out.println(lista);

        lista.adicionaInicio(6);
        System.out.println(lista);

        lista.adicionaFinal(5);
        System.out.println(lista);
    }
}
