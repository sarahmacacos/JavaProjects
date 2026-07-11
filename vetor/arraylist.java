package vetor;
import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();

        while (true) {
            System.out.print("Nome: ");
            String entrada = sc.nextLine().trim();

            if (entrada.equalsIgnoreCase("FIM")) break;

            if (!entrada.isEmpty())
                nomes.add(entrada);
        }

        for (int i = nomes.size(); i > 0; i--) {
            System.out.println(nomes.get(i - 1));
        }
        for (String n : nomes) {
            System.out.print(n);
        }
        System.out.println(nomes);


    }
}
