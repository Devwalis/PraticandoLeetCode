public class SomaDePares{
    public static int somarPares(int[] numeros){
        int soma = 0;
        for(int numero : numeros){
            if(numero % 2 == 0){
                soma += numero;
            }
        }
        return soma;
    }


    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        int resultado = somarPares(array);
        System.out.println("Soma dos pares: " + resultado);
    }
}
