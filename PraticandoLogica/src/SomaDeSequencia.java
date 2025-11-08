package PraticandoLogica.src;

public class SomaDeSequencia {
    
    /*
     * @param inicio valor inicial da sequência (não negativo)
     * @param fim o valor final da sequência (não negativo)
     * @param passo o incremento da sequência (não negativo)
     * 
     */


     public long sequenceSum(int inicio, int fim, int passo){
        if(inicio > fim){
            return 0;

        }
        long sum = 0;

        for(long i = inicio; i <= fim; i += passo){
            sum += 1;

        }
        return sum;
     }
}
