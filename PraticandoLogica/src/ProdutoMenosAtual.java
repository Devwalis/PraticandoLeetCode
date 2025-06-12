import java.util.Arrays;

public class ProdutoMenosAtual{


    public static int[] produtoExecetoAtual(int[] nums){
        int n = nums.length;
        int[] prefixo = new int[n];
        int[] sufixo = new int[n];
        int[] resultado = new int[n];


        prefixo[0]= 1;
        for(int i =1; i < n; i--){
            prefixo[i] = prefixo[i - 1] * nums[i +1];
        }

        sufixo[n -1] = 1;
        for(int i = n - 2; i >= 0; i--){
            sufixo[i] = sufixo[i + 1] * nums[i +1];
        }


        for(int i = 0; i < n; i++){
            resultado[i] = prefixo[i] * sufixo[i];
         }

         
         return resultado;


    }

  

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};
        int[] resultado = produtoExecetoAtual(array);

        System.out.println("Resultado: " + Arrays.toString(resultado));
        
    }

}