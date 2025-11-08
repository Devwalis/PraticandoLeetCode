package PraticandoLogica.src;
import java.util.Arrays;

public class PrimeiroNomeComAsteriscos {

    public static String formataString(String[] str){
        Arrays.sort(str);
        String primeiro = str[0];
        StringBuilder formatted = new StringBuilder();

        for(int i =0; i < primeiro.length(); i++){
            formatted.append(primeiro.charAt(i));
            if(i < primeiro.length() - 1){
                formatted.append("***");
            }
        }
        return formatted.toString();

    }
     public static void main(String[] args) {
        String[] exemplo1 = {"banana", "apple", "cherry"};
        String[] exemplo2 = {"Zoo", "alpha", "Beta"};

        System.out.println(formataString(exemplo1)); 
        System.out.println(formataString(exemplo2)); 
    
}
}