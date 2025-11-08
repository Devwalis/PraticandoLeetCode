package PraticandoLogica;

import java.util.Scanner;

public class BemVindoNomeCidadeEstado{


    public static String Hello(String[] nome, String cidade, String estado){
        String fullName = String.join("", nome);
        return String.format("Olá seja %s Bem vindos %s, %s!",fullName, nome, estado);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome completo: ");
        String nomeCompleto = scanner.nextLine();
        String[] nome = nomeCompleto.trim().split("");

        System.out.println("Digite sua cidade: ");
        String cidade = scanner.nextLine();

        System.out.println("Digite seu estado: ");
        String estado = scanner.nextLine();

        scanner.close();
    }
}