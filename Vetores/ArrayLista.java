package Vetores;

import java.util.*;

public class ArrayLista {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();

        // Entrada dos nomes
        while (true) {
            System.out.print("Nome: ");
            String entrada = sc.nextLine().trim();
            if (entrada.equalsIgnoreCase("FIM")) break;
            if (!entrada.isEmpty()) nomes.add(entrada);
        }

        // Impressão de trás pra frente
        System.out.println("\nLista em ordem inversa:");
        for (int i = nomes.size() - 1; i >= 0; i--) {
            System.out.println(nomes.get(i));
        }

        // 1. Renomear
        System.out.print("\nInforme um nome para remover: ");
        nomes.remove(sc.nextLine());
        System.out.print("Digite o novo nome: ");
        nomes.add(sc.nextLine());
        System.out.println("Após renomear: " + nomes);

        // 2. Inserir novo nome
        System.out.print("\nInsira um novo nome: ");
        nomes.add(sc.nextLine());
        System.out.println("Após inserir: " + nomes);

        // 3. Buscar nome e mostrar posição
        System.out.print("\nInforme um nome para busca: ");
        String busca = sc.nextLine();
        System.out.println("O nome informado está no índice " + nomes.indexOf(busca));

        // 4. Inserir na 2ª posição
        System.out.print("\nInforme um nome para inserir na 2ª posição: ");
        nomes.add(1, sc.nextLine());
        System.out.println("Após inserir na 2ª posição: " + nomes);

        // Mostrar de trás pra frente novamente
        System.out.println("\nLista final (ordem inversa):");
        for (int i = nomes.size() - 1; i >= 0; i--) {
            System.out.println(nomes.get(i));
        }
    }
}
