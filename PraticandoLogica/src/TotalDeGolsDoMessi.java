public class TotalDeGolsDoMessi {
    public static int totalGols(int laLiga, int copaDelRey, int champions){
        return laLiga + copaDelRey + champions;
    }

    public static void main(String[] args) {
        System.out.println(totalGols(5, 20, 4));
        System.out.println(totalGols(1, 10, 2));
        System.out.println(totalGols(8, 9, 3));
}
}