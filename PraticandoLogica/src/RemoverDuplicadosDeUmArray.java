import java.util.Scanner;

public class RemoverDuplicadosDeUmArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite o tamanho do array: ");
        int tamanho = scanner.nextInt();

        int[] array = new int[tamanho];
        System.out.println("Digite os elementos do array: ");
        for (int i = 0; i < tamanho; i++){
            array[i] = scanner.nextInt();
        }

        //contar elementos únicos
        int conteUnico = 0;
        for(int i = 0; i < tamanho; i++){
            boolean isDulicate = false;
            for(int j = 0; j < i; j++){
                if(array[i] == array[j]){
                    isDulicate = true;
                    break;
                }
            }
            if(!isDulicate) conteUnico++;

        }

        //Criar array temporário
        int[] temp = new int[tamanho];
        int index = 0;


        //Preencher com valores únicos
        for(int i =0; i <tamanho; i++){
            boolean exists = false;
            for(int j = 0; j < index; j++){
                if(array[i] == temp[j]){
                    exists = true;
                    break;

                }
            }

            if(!exists) temp[index++] = array[i];
        }
        //Criar array final compactado
        int[] resultado = new int[conteUnico];
        System.arraycopy(temp, 0, resultado, 0, conteUnico);


        //Exibir resultado
        System.out.print("Array sem duplicados: [");
        for(int i =0; i < resultado.length; i++){
            System.out.print(resultado[i]);
            if(i < resultado.length -1) System.out.print(", ");
        }
        System.out.println("]");

        scanner.close();
    }


    
}
