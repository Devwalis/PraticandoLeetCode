


public class ContarOcorrencias {

    public static int contar(int[] array, int numeroDesejado){
        int contador =0;


        for(int i = 0; i < array.length; i++){
            if(array[i] == numeroDesejado){
                contador++;

            }
        }
        return contador;

    }

    public static void main(String[] args) {
        int[] numeros = {1,2,3,2,4,2,5};
        int alvo = 2;

        System.out.println("Número " + alvo + " ocorre " + contar(numeros, alvo) + " vezes. ");
    }
    
}



/*
 * Alternativa usando laço for tradicional
 * 
 * public int countOcorrencesAlternative(String str, char searchChar){
 *  
 * int count = 0;
 * 
 * for(int i = 0; i < str.length(); i++){
 *  if(str.charAt(i) == searchChar){
 *          count++;
 * }
 * }
 * return count;
 * 
 * }
 */
