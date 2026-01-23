package PraticandoLogica.src;

public class RemoverExclamacoes {

    public static String removerExclamtionMarks(String s){


    StringBuilder  resultado = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
        char c = s.charAt(i);

        if( c != '!'){
            resultado.append(c);
        }

        
    }
    return resultado.toString();

    }
    




}
