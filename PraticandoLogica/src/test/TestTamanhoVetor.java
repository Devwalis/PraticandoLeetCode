package PraticandoLogica.src.test;

import PraticandoLogica.src.estruturaDeDados.Vetor;

public class TestTamanhoVetor {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(10);

        vetor.adiciona("elemento1");
        vetor.adiciona("elemento2");
        vetor.adiciona("elemento3");

        System.out.println(vetor.toString());
    }
}
