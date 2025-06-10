

public class SomarMaximaContigua{

    public static int somaMaxima(int[] nums){
        int somaAtual = nums[0];
        int somaMaxima = nums[0];

        for(int i = 1; i < nums.length; i++){
            // Se a soma interior for negativa, inciar nova subarray a partir do índice atual
            somaAtual = Math.max(nums[i], somaAtual + nums[i]);
            somaMaxima = Math.max(somaMaxima, somaAtual);

        }

        return somaMaxima;

    }


    public static void main(String[] args){
        int[] array = {-2, 1 , -3, 4,-1, 2 ,1 ,-5, 4};


        int resultado = somaMaxima(array);
        System.out.println("A soma máxima de subarray é: " + resultado);


    }

    
}