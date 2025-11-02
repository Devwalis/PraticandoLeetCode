package PraticandoLogica.src;

public class BebidaPorIdade {
    

    public static String bebidaPorIdade(int idade){
        if (idade < 14){
            return "drink toddy";
        } else if (idade < 18){
            return "drink coke";

        } else if (idade < 21){
            return "drink beer";
        } else{
            return "drink whisky";
        }
        }

        public static void main(String[] args) {
            System.out.println(bebidaPorIdade(10));
            System.out.println(bebidaPorIdade(16));
            System.out.println(bebidaPorIdade(19));
            System.out.println(bebidaPorIdade(25));
        }
    }

