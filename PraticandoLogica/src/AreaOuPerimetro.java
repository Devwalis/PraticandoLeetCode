package PraticandoLogica.src;

public class AreaOuPerimetro {

    public static int areaOrPerimeter(int l, int w){
        if(l == w){
            return l * w;
        }else{
            return 2 * (w + l);
        }
    }
    public static void main(String[] args){
    System.out.println(areaOrPerimeter(6, 10));
}

    
}

    