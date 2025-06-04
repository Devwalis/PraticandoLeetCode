public class Fibomacci {

    public static int fibonacciRecursivo(int n){
        if(n <= 1){
            return n;

        }
        return fibonacciRecursivo( n -1) + fibonacciRecursivo( n -2);
    }

    public static int fibonacciInterativo(int n){
        if(n <= 1){
            return n;
        }
        int a = 0, b =1, resultado = 0;
        for(int i = 2; i<= n; i++){
            resultado = a +b;
            a= b;
            b = resultado;

        }
        return resultado;

    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println("Fibonacci Recursivo de " + n +":" + fibonacciRecursivo(n));
        System.out.println("Fibonacci Interativo de " + n + ":" + fibonacciInterativo(n));
    }
    
}
