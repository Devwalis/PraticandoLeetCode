package PraticandoLogica;

public class SaudacaoPersonalizada {
    

    public static String saudar(String nome, String owner){
        if(nome.equals(owner)){
            return "Hello boss";

        } else{
            return"Hello guest";
        }
    }
}
