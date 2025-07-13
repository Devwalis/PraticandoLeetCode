public class ReverterDigitos {
    public static int[] digitalize(long numero){
        String numStr = String.valueOf(numero);
        int[] result = new int[numStr.length()];

        for(int i =0; i < numStr.length(); i++){
            result[i] = Character.getNumericValue(numStr.charAt(numStr.length() -1 -i));
             
        }
        return result;
    }

    public static void main(String[] args) {
        long input1 = 35231;
        long input2 = 0;

        int[] result1 = digitalize(input1);
        int[] result2 = digitalize(input2);
        

        System.out.println("Resultado 1: ");
        for(int n : result1) System.out.println(n +" ");

        System.out.println("Resultado 2: ");
        for(int n : result2) System.out.println(n + " ");
    }
}
