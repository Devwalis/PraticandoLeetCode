import java.util.HashMap;
import java.util.Map;

public class DuasSomasEmUmArray {
    public static int[] encontrarIndices(int[] nums, int alvo){
        Map<Integer, Integer> mapa = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int complemento = alvo  - nums[i];

            if(mapa.containsKey(complemento)){
                return new int[] {mapa.get(complemento), i};

            }
            mapa.put(nums[i], i);
        }

        return new int[]{};
        
    }

    public static void main(String[] args){
        int[] numeros = {2, 7, 11, 15};
        int alvo = 9;

        int[] resultado = encontrarIndices(numeros, alvo);
        System.out.println("Índices encontrados: [" + resultado[0] + "," + resultado[1] + "]");
        
    }
}
