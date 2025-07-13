public class ReverterDigitos {
    public static int[] digitalize(long numero){
        String numStr = String.valueOf(numero);
        int[] result = new int[numStr.length()];

        for(int i =0; i < numStr.length(); i++){
            result[i] = Character.getNumericValue(numStr.charAt(numStr.length() -1 -i));
             
        }
        return result;
    }
}
