public class Polindromo {
    

    public static boolean ehPalindromo(String texto){
        texto = texto.replaceAll("\\s+", "").toLowerCase();

        int esquerda = 0;
        int direita = texto.length() -1;

        while ( esquerda < direita){
            if(texto.charAt(esquerda) != texto.charAt(direita)){
                return false;
            }
            esquerda++;
            direita--;

        }
        return true;

    }
    public static void main(String[] args) {
        String palavra = "Radar";

        boolean resultado = ehPalindromo(palavra);
        System.out.println("É Palíndromo " + resultado);
    }
}
