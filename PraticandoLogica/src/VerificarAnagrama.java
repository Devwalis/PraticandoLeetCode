import java.util.Arrays;
import java.util.Scanner;

public class VerificarAnagrama {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira palavra: ");
        String palavra1 = scanner.nextLine();


        System.out.print("Digite a segunda palavra: ");
        String palavra2 = scanner.nextLine();

        if(Anagrama(palavra1, palavra2)){
            System.out.println(palavra1 +" e " + palavra2 + " não são anagramas.");
        } else{
            System.out.println(palavra1 + " e " + palavra2 +" não são anagramas.");
        }

        scanner.close();
    }


    public static boolean Anagrama(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;

        }

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }
    
}
