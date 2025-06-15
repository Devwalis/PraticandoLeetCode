public class EncontrarNumeroUnico{
    public static int encontrarNumeroUnico(int[] nums){
     int   resultado = 0;

     for(int num : nums){
        resultado ^= num;

     }
     return resultado;

    }

    public static void main(String[] args) {
        int[] array = {4, 1, 2, 1, 2, 4, 9};
        int numero = encontrarNumeroUnico(array);
        System.out.println("O número único é: " + numero);
    }
}
