import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class PrimeiroCaractereNaoRepetido {
    

    public static char  encontrarPrimeiroNaoRepetido(String texto){
        Map<Character, Integer> mapaFrequecia = new LinkedHashMap<>();

        //Contar frequência de cada caractere
        for(char c : texto.toCharArray()){
            mapaFrequecia.put(c, mapaFrequecia.getOrDefault(c,0) + 1);
        }


        // Encontrar o primeiro caractere com frequência 1
        for(char c : texto.toCharArray()){
            if(mapaFrequecia.get(c) == 1){
                return c;

            }
        }

        return '\0';

        

        
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String palavra = scanner.nextLine();


        char resultado = encontrarPrimeiroNaoRepetido(palavra);

        if (resultado != '\0'){
            System.out.println("Primeiro caractere não repatido: " + resultado);
        } else{
            System.out.println("Todos os caracters se repetem. ");
        }
        scanner.close();
    }
}
