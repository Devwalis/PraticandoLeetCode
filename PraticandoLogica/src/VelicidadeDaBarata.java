package PraticandoLogica.src;

public class VelicidadeDaBarata {



    public static int velicidadeBarata(double x){
        double cmPorSegundo = x * 100000 / 3600;


        return (int) cmPorSegundo;
    }
    
}
