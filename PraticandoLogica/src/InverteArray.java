public class InverteArray {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4};
        inverterArray(numeros);


        for(int numero : numeros){
            System.out.print(numero + " ");
        }

    }
    public static void inverterArray(int[] array ){
        int inicio = 0;
        int fim = array.length -1;

        while (inicio < fim ) {
            int temp = array[inicio];
            array[inicio] = array[fim];
            array[fim] = temp;

            inicio++;
            fim--;
            
        }
    }

    
}
