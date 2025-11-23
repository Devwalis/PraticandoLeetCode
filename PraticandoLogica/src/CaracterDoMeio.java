package PraticandoLogica.src;

public class CaracterDoMeio{
    

    public static String GetMidlle(String word){


            int tamanho = word.length();


    int metade = tamanho /2;


    if(tamanho % 2 == 0){
        return word.substring(metade- 1, metade +1);

    }else{
        return word.substring(metade, metade + 1);
    }


    }
}

