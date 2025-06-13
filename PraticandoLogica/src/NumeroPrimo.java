import java.util.Scanner;

public class NumeroPrimo {
    

    public static boolean ehPrimo(int n){
        if(n <= 1) return false;
        for(int i = 2; i<= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        
        boolean resultado = ehPrimo(numero);
        System.out.println("É primo? "+ resultado);

        scanner.close();
    }

  
}


