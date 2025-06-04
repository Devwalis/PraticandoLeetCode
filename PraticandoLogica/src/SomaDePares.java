public class SomaDePares {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5,6};
        int soma = somarPares(numeros);
        System.out.println("Soma dos pares: " + soma);

    }

public static int somarPares(int[] array){
    int soma = 0;
    for( int numero : array){
        if (numero % 2 ==0){
            soma+= numero;

        }
    }
    return soma;
}
    
}
