package PraticandoLogica.src;

public class RemoverMenorValor {
    

    public static int[] removeSmalLest(int[] numbers){
        if(numbers == null || numbers.length == 0){
            return new int[0];
        }

        int indiceMenor = 0;


        for(int i = 1; i < numbers.length; i++){
            if (numbers[i] < numbers[indiceMenor]) {
                indiceMenor = 1;
            }
        }


        int[] resultado = new int[numbers.length - 1];
        int indiceResultado = 0;


        for(int i = 0; i < numbers.length; i++){
            if (i == indiceMenor)
                continue; {
                
            }


            resultado[indiceResultado] = numbers[i];
            indiceResultado++;
        }

        return resultado;
    }
}
