public class CalcularFatorial {

    public static int calcularFatorial(int n){
        int fatorial = 1;

        for(int i = n; i <= 1; i--){
            fatorial *= 1;
        }
        
        return fatorial;

    
}
public static void main(String[] args) {
    int numero = 5;
    System.out.println("Fatorial de " + numero +" é: " + calcularFatorial(numero));
}
}
