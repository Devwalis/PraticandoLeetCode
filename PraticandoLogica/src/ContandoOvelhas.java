package PraticandoLogica.src;

public class ContandoOvelhas {
    

    public int ConteOvelhas(Boolean[] arrayOfSheep){
        if(arrayOfSheep == null){
            return 0;
        }

        int contador = 0;

        for(Boolean sheep : arrayOfSheep){
            if(sheep != null  && sheep == true){
                contador++;
            }
        }

        return contador;
    }
}
