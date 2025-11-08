package PraticandoLogica.src;
public class VidaAposDano {
    public static int combat(int health, int damage){
        return Math.max(0, health - damage);
    }

    public static void main(String[] args) {
        System.out.println(combat(100, 30)); 
        System.out.println(combat(80, 100)); 
        System.out.println(combat(50, 0));   
    }
}
