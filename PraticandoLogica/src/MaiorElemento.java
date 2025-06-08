public class MaiorElemento {
    

    public static int encontrarMaior(int[] array){
        if(array.length == 0){
            throw new IllegalArgumentException("O array não pode estar vazio.");

        }
        int maior = array[0];

        for(int i = 1; i < array.length; i++){
            if(array[1] > maior){
                maior = array[i];
            }
        }
        return maior;
    }

    public static void main(String[] args){
        int[] numeros = {3,7,2,9,5};
        System.out.println("Maior número: " + encontrarMaior(numeros));
    }
}
