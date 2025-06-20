public class BemVindoNomeCidadeEstado{


    public static String Hello(String[] nome, String cidade, String estado){
        String fullName = String.join("", nome);
        return String.format("Olá seja %s Bem vindos %s, %s!",fullName, nome, estado);
    }
}