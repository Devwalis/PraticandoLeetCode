package PraticandoLogica.src;

public class Banjo {

    public static String voceEstarTocandoBanjo(String nome){
        

        char primeiraLetra = nome.charAt(0);


        if(primeiraLetra == 'R' || primeiraLetra == 'r'){
            return nome + "Toque banjo";

        }else{
            return nome + "vc não toca banho";
        }
    }
    
}
