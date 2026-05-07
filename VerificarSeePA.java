public class VerificarSeePA {
    

    public boolean ePar(double n){
        if( n % 1 !=0){
            return false;
        }
        long integerPart = (long) n;
        

        return Math.abs(integerPart % 2) == 0;
    }
}
