package PraticandoLogica.src;

public class VerificarSeeFator {

    public boolean checarFator(int base, int factor){

        return base % factor == 0;
    }

    public static void main(String[] args) {
        VerificarSeeFator check = new VerificarSeeFator();

        System.out.println("2 é fator de 6? " + check.checarFator(6, 2));
        System.out.println();
        System.out.println();

    }
    }
    
    
    

