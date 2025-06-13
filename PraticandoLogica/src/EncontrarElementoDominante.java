public class EncontrarElementoDominante {
    
    public static int encontrarDominante(int[] nums){
        int candidato = nums[0];
        int contador = 1;


        // Etapa 1: Encontrar candidato
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == candidato){
                contador++;

            } else {
                contador--;
                if(contador == 0){
                    candidato = nums[i];
                    contador = 1;
                }
            }
        }

        //Etapa 2 (opcional): Verificar se é realmente dominante
        contador = 0;
        for(int num : nums){
            if(num == candidato){
                contador++;

            }
        }

        return (contador > nums.length / 2)? candidato : -1; //indica que não dominante
    }


    public static void main(String[] args){
        int[] array = {2, 2, 1, 2, 3, 2, 2, 4,5,6};
        int dominante = encontrarDominante(array);

        if ( dominante != -1){
            System.out.println("O elemento dominante é: " + dominante);

        } else {
            System.out.println("Não há elemento dominante. ");
        }
    }
}
