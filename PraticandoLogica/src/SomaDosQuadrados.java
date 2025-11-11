package PraticandoLogica.src;

public class SomaDosQuadrados {
    

    public static int SomaQuadrador(int[] numeros){
        int soma = 0;
        for(int num : numeros){
            soma += (num * num);
        }
        return soma;

    }

    public static void main(String[] args) {
        System.out.println(SomaQuadrador(new int[]{1, 2, 3}));
        System.out.println(SomaQuadrador(new int[]{1, 2}));
        System.out.println(SomaQuadrador(new int[]{}));
        System.out.println(SomaQuadrador(new int[]{1, 2, 3}));
        System.out.println(SomaQuadrador(new int[]{-1, -2}));
    }
}
