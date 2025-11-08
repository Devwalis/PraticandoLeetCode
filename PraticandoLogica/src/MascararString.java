package PraticandoLogica;
public class MascararString{

    public static String maskify(String str){

        //Se a String for muito curta não precisa mascarar
        if(str.length() <= 4){
            return str;
        }

        int maskedInfo = str.length() - 4;
        StringBuilder masked = new StringBuilder();


        //Adiciona os caracter mascarados
        for(int i =0; i <maskedInfo; i++){
            masked.append("#");

        }


        //Adiciona os caracter original
        masked.append(str.substring(maskedInfo));

        return masked.toString();
    }
}
