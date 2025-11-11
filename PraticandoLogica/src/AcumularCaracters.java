package PraticandoLogica.src;


public class AcumularCaracters{

    public static String accum(String s){
        StringBuilder result = new StringBuilder();



        for(int i = 0; i < s.length(); i++){
            char indiceDoCaracter = s.charAt(i);
            result.append(Character.toLowerCase(indiceDoCaracter));



             for(int j = 0; j < i; j++){
            result.append(Character.toUpperCase(indiceDoCaracter));

        }

        if(i < s.length() - 1){
            result.append("-");
        }
        }


       

        return result.toString();
    }

    public static void main(String[] args){
        System.out.println(accum("abcd"));
        System.out.println(accum("readf"));
        System.out.println(accum("xeucy"));
        System.out.println(accum("dasdr"));
        System.out.println(accum("affet"));
    }
}