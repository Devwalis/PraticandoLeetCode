package PraticandoLogica.src;

import java.util.HashSet;
import java.util.Set;

public class Isograma {

    public static boolean isIsograma(String str){

        str = str.toLowerCase();



        if(str.isEmpty()){
            return true;
        }

        Set<Character> seenCharacters = new HashSet<>();

        for( char c : str.toCharArray()){
            
            if(seenCharacters.contains(c)){
                return false;
            }

            seenCharacters.add((c));
        }

        return true;
    }
    public static void main(String[] args) {
        System.out.println(isIsograma("Dermatoglyphics"));
        System.out.println(isIsograma("aba"));
        System.out.println(isIsograma("moUse"));
        System.out.println(isIsograma("abcdefg"));
        
    }
  
}



    

