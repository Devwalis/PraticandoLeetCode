package PraticandoLogica.src;

public class RemoverAncoraDaURL {
    
    public static String removerUrlAnchor(String url){
        int posicaoDaAncora = url.indexOf('#');
        if(posicaoDaAncora != -1){
            return url.substring(0, posicaoDaAncora);
        }
        return url;
    }

    public static void main(String[] args){

        System.out.println(removerUrlAnchor("www.codewars.com#about"));
    }
}
