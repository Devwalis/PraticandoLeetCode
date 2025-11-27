package PraticandoLogica.src.estruturaDeDados;

import java.util.Arrays;

public class Vetor {


    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade){
        this.elementos = new String[capacidade];
        tamanho = 0;
    }


public boolean adiciona(String elemento) throws Exception{
    if(tamanho < elemento.length()){
        elementos[tamanho] = elemento;
        tamanho++;
        return true;

    } 
    return false;
}
}