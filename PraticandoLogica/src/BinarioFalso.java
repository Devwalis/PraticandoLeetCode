package PraticandoLogica.src;

public class BinarioFalso {
    

    public static String fakeBin(String numberString){

        StringBuilder result = new StringBuilder();


        for(int i = 0; i< numberString.length(); i++){
            char caracterAtual = numberString.charAt(i);


            if(caracterAtual < '5')
{
    result.append('0');
} else {
    result.append('1');
}        }
        return "";
    }
}
