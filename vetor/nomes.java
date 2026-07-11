package vetor;
import java.util.Scanner;
public class nomes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[5];

        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Informe o " + (i + 1) + "º nome: ");
            nomes[i] = sc.nextLine().trim();
        }
        System.out.println("\nNomes em ordem inversa:");
        for (int i = nomes.length - 1; i >= 0; i--) {
            System.out.println(nomes[i]);
        }
        System.out.println("\nNomes na ordem original:");
        for (String nome : nomes) {
            System.out.print(nome + " - ");
        }
        sc.close();
    }
    }