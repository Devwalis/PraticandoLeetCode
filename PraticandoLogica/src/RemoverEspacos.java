package PraticandoLogica.src;

public class RemoverEspacos {

    public static String removerEspacos(final String x){
        StringBuilder resultado = new StringBuilder();
        for(int i = 0; i < x.length(); i++){
            char caracterAtual = x.charAt(i);
            if(caracterAtual != ' '){
                resultado.append(caracterAtual);
        }
    }
    return resultado.toString();
}
}