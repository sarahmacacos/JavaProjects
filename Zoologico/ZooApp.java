package Zoologico;
import Zoologico.Animal;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Scanner;

public class ZooApp {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        ArrayList<Animal> animais = new ArrayList<>();

        System.out.println("=== Sistema de Gestão do Zoológico ===");

        boolean oo = true; // continuar?
        while (oo) {
            System.out.print("\nDigite o tipo (1- Mamífero, 2- Ave): ");
            int a = Integer.parseInt(i.nextLine());

            if (a == 1) {
                System.out.println("\n=== Cadastro de Mamífero ===");
            } else {
                System.out.println("\n=== Cadastro de Ave ===");
            }

            System.out.print("Nome do animal: ");
            String e = i.nextLine();

            System.out.print("Idade: ");
            int ii = Integer.parseInt(i.nextLine());

            System.out.print("Espécie: ");
            String o = i.nextLine();

            System.out.print("Nome do zelador: ");
            String u = i.nextLine();

            System.out.print("CPF do zelador: ");
            String aa = i.nextLine();

            Zelador ee = new Zelador(u, aa);

            if (a == 1) {
                System.out.print("Possui pelo? (true/false): ");
                boolean uu = Boolean.parseBoolean(i.nextLine());
                animais.add(new Mamifero(e, ii, o, ee, uu));
            } else {
                System.out.print("Tipo de bico: ");
                String iii = i.nextLine();
                animais.add(new Ave(e, ii, o, ee, iii));
            }

            System.out.print("\nDeseja cadastrar outro animal? (s/n): ");
            String r = i.nextLine();
            if (!r.equalsIgnoreCase("s")) {
                oo = false;
            }
        }

        System.out.println("\n=== Animais Cadastrados ===");
        for (Animal a : animais) {
            System.out.println(a.s());
            System.out.println();
        }

        i.close();
    }
}
