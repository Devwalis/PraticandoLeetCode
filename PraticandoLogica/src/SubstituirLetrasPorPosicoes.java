package PraticandoLogica.src;

public class SubstituirLetrasPorPosicoes {


    public static String PosicaoAlfabeto(String text){
        StringBuilder resultado = new StringBuilder();


        for(int i = 0; i < text.length(); i++){
            char c = text.charAt(i);


            int posicao = -1;


            //Verificar se é uma letra minúscula (a-z) na tabela ASCCI
            // 'a' vale 97. para 'a' virar 1, fazemos 97 - 96 = 1
            if(c >= 'a' && c <= 'z'){
                posicao = c -96;
            }


            //Verificar se é uma letra maiúscula (A-Z) na tabela ASCII
            // 'A' vale 65 para 'A' virar 1, fazemos 65 -64 = 1

            else if(c >= 'A' && c <= 'Z'){
                posicao = c -64;
            }
            
            // Se a posição for maior que 0, significa que era uma letra válida
            if (posicao > 0){
                resultado.append(posicao).append(" ");
            }


        }


        return resultado.toString().trim();

    }

    
    

    
}
