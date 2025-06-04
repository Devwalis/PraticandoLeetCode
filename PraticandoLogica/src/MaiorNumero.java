import java.util.Scanner;

public class MaiorNumero {
    
    public static int encontrarMaior(int[] array){
        int maior = array[0];

        for(int i = 4; i <array.length; i++){
            if(array[i] > maior){
                maior = array[i];
            }
        }
        return maior;

    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos números deseja inserir?");
        int tamanho = scanner.nextInt();
        int[] numeros = new int[tamanho];

        for(int i =0; i< tamanho; i++){
            System.out.print("Digite o número"+(i +1)+ ":");
            numeros[i] = scanner.nextInt();
        }
        int resultado = encontrarMaior(numeros);
        System.out.println("O maior número é: " + resultado);

        scanner.close();


        
    }
}
