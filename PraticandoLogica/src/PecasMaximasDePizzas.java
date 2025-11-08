package PraticandoLogica.src;

public class PecasMaximasDePizzas {
    

    public long maxPizza(int cortes){
        if(cortes < 0){
            return -1;

        }

        int n = cortes;
        return 1 + (n * (n+ 1)) / 2;
    }
}
