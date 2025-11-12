package PraticandoLogica.src;

public class QuadradoDosDigitos {
    

    public int squareDigits(int num){
     String numStr = String.valueOf(num);
     StringBuilder resultBuilder = new StringBuilder();
     

     for(char digitChar : numStr.toCharArray()){
        int digit = Character.getNumericValue(digitChar);
        int squareDigits = digit *digit;
        resultBuilder.append(squareDigits);
     }





        return Integer.parseInt(resultBuilder.toString());
    }

}
