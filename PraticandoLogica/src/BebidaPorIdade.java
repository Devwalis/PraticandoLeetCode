public class BebidaPorIdade {
    

    public static String bebidaPorIdade(int idade){
        if (idade < 14){
            return "toddy";
        } else if (idade < 10){
            return "coke";

        } else if (idade < 21){
            return "beer";
        } else{
            return "whisky";
        }
        }

        public static void main(String[] args) {
            System.out.println(bebidaPorIdade(10));
            System.out.println(bebidaPorIdade(16));
            System.out.println(bebidaPorIdade(19));
            System.out.println(bebidaPorIdade(25));
        }
    }

