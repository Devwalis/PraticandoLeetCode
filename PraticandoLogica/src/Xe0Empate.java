package PraticandoLogica.src;

public class Xe0Empate {
    

    public static boolean getX0(String str){
        int countX = 0;
        int count0 = 0;


        for(int i =0; i < str.length(); i++){
            char c = str.charAt(i);

            if(c == 'x' || c == '0'){
                countX++;

            }

            else if(c == 'o' || c == '0'){
                count0++;

            }
        }
        return countX == count0;
    }

    
public static void main(String[] args){
    System.out.println(getX0("ooxx"));
    
}

}
