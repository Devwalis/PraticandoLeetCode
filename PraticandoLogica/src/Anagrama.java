import java.util.Arrays;
import java.util.Scanner;

public class Anagrama {

    public static boolean saoAnagramas(String s1, String s2){
        s1 = s1.replaceAll("\\s+"," ").toLowerCase();
        s2 = s2.replaceAll("\\s+", "").toLowerCase();

        if(s1.length() != s2.length()){
            return false;


        }

        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        return Arrays.equals(chars1, chars2);
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite a primeira palavra: ");
        String primeira = scanner.nextLine();

        System.out.print("Digite a segunda palavra: ");
        String segunda = scanner.nextLine();

        if(saoAnagramas(primeira, segunda)){
        System.out.println("As palavras são anagramas.");
         } else{
            System.out.println("As palavras Não são anagramas.");
        }
        scanner.close();
        }

        
    }
    
    

