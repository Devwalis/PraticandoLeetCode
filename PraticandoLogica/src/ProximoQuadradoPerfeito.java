package PraticandoLogica.src;
public class ProximoQuadradoPerfeito {
    public static long quadradoPerfeito(long numero){
        double raiz = Math.sqrt(numero);

        
        if(raiz % 1 != 0){
            return -1;
        }

        long proximaRaiz = (long) raiz + 1;
        return proximaRaiz * proximaRaiz;


    }

    public static void main(String[] args){
        System.out.println(quadradoPerfeito(121)); // 144
        System.out.println(quadradoPerfeito(625)); // 676
        System.out.println(quadradoPerfeito(114)); // -1
        System.out.println(quadradoPerfeito(1));   // 4
        System.out.println(quadradoPerfeito(0));   // 1
    
    }
}
