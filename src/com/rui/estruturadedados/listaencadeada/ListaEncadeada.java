package com.rui.estruturadedados.listaencadeada;

import java.util.StringJoiner;

public class ListaEncadeada {

    private No cabeca;
    private No cauda;
    private int tamanho;

    public ListaEncadeada() {
        this.cabeca = null;
        this.cauda = null;
        this.tamanho = 0;
    }

    public void adicionaInicio(int valor){
        No celula = new No(valor);
        celula.setProximo(cabeca);
        if (this.tamanho == 0){
            this.cabeca = celula;
            this.cauda = celula;
        } else {
            this.cabeca = celula;
        }
        this.tamanho++;
    }

    public void adicionaFinal(int valor){
        No celula = new No(valor);
        celula.setProximo(null);
        if (this.tamanho == 0) {
            this.cabeca = celula;
            this.cauda = celula;
        } else {
            cauda.setProximo(celula);
            this.cauda = celula;
        }
    }

    public No getCabeca() {
        return cabeca;
    }

    public void setCabeca(No cabeca) {
        this.cabeca = cabeca;
    }

    public No getCauda() {
        return cauda;
    }

    public void setCauda(No cauda) {
        this.cauda = cauda;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", ListaEncadeada.class.getSimpleName() + "[", "]")
                .add("cabeca=" + cabeca)
                .add("cauda=" + cauda)
                .add("tamanho=" + tamanho)
                .toString();
    }
}
