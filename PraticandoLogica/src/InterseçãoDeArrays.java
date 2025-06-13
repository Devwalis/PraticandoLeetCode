import java.util.HashSet;
import java.util.Set;

public class InterseçãoDeArrays {
    
    public static int[] interseccao(int[] nums1, int[] nums2){
        Set<Integer> conjunto = new HashSet<>();
        Set<Integer> resultado = new HashSet<>();

        //Armaxrns os elementos do primeiro array no Set
        for(int num : nums1){
            conjunto.add(num);
        }
        // verifica se os elementos do segundo array também existem no Set
        for(int num : nums2){
            if(conjunto.contains(num)){
                resultado.add(num);
            }
        }

        int[] resposta = new int[resultado.size()];
        int i = 0;
        for(int num : resultado){
            resposta[i++] = num;
        }
        return resposta;
        
    }


    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {3,4,5,6,7};

        int[] resultado = interseccao(array1, array2);
        System.out.println("Elementos em comum: ");
        for(int num : resultado){
            System.out.println(num + " ");
        }
    }
}
