package PraticandoLogica.src.estruturaDeDados.test;

import PraticandoLogica.src.estruturaDeDados.Vetor;

public class TestandoVetor {

    public static void main(String[] args){

         Vetor vetor = new Vetor(5);


         try
         {

                vetor.adiciona("elemento1");
                vetor.adiciona("elemento2");
                vetor.adiciona("elemento3");
                vetor.adiciona("elemento4");

         } catch(Exception e){
            e.printStackTrace();
         }
      
}

    }

