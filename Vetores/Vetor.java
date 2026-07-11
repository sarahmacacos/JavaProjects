package Vetores;
import java.util.*;

public class Vetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[5];

        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Informe o " + (i + 1) + "º nome: ");
            nomes[i] = sc.nextLine().trim();
        }

        System.out.println("\nNomes originais:");
        for (String n : nomes) System.out.print(n + " ");

        // Exemplo: renomear o primeiro
        System.out.print("\n\nNovo nome para posição 1: ");
        nomes[0] = sc.nextLine();

        System.out.println("Após renomear:");
        for (String n : nomes) System.out.print(n + " ");
    }
}
