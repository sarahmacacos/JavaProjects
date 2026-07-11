package boaspraticas;

import java.util.*;
import java.io.*;

public class MainTudoEmUm {
    // adicionamos alguns livros iniciais para o sistema não começar vazio
    private static List<String> livros = new ArrayList<>(Arrays.asList(
            "It",
            "You",
            "Scream",
            "The Shining",
            "1984"
    ));
    private static Scanner sc = new Scanner(System.in);
    private static int totalEmprestimos = 0;

    public static void main(String[] args) {
        carregarLivros();
        while (true) {
            // menu levemente alterado (mais claro e organizado)
            System.out.println(
                    "\nMENU\n" +
                            "1 - Adicionar livro\n" +
                            "2 - Emprestar livro\n" +
                            "3 - Listar livros\n" +
                            "4 - Sair\n"
            );
            int op = sc.nextInt();
            sc.nextLine();

            if (op == 1) {
                System.out.print("Titulo: ");
                String titulo = sc.nextLine();
                if (titulo.length() < 3) {
                    System.out.println("ERRO: Titulo curto!");
                    continue;
                }
                // verificação melhor para evitar duplicados ignorando maiúsculas/minúsculas
                boolean existe = false;
                for (String l : livros) {
                    if (l.equalsIgnoreCase(titulo)) {
                        existe = true;
                        break;
                    }
                }
                if (existe) {
                    System.out.println("Livro ja existe!");
                } else {
                    livros.add(titulo);
                    salvarLivros();
                    System.out.println("Adicionado!");
                }

            } else if (op == 2) {
                System.out.print("Titulo para emprestimo: ");
                String tituloEmprestimo = sc.nextLine().toLowerCase();
                boolean encontrado = false;
                for (int i = 0; i < livros.size(); i++) {
                    // busca agora ignora diferença entre maiúsculas e minúsculas
                    if (livros.get(i).toLowerCase().contains(tituloEmprestimo)) {
                        totalEmprestimos++;

                        System.out.println("Emprestado! Total: " + totalEmprestimos);
                        encontrado = true;

                        System.out.println("Livros disponiveis: " + (livros.size() - totalEmprestimos));
                        break;
                    }
                }
                if (!encontrado) {
                    System.out.println("Livro nao encontrado!");
                }
            } else if (op == 3) {
                System.out.println("Livros (" + livros.size() + "):");
                for (String l : livros) {
                    System.out.println("- " + l);
                }
            } else if (op == 4) {
                salvarLivros();
                System.out.println("Saindo...");
                break;
            } else {
                System.out.println("Opcao invalida!");
            }
        }
    }
    private static void carregarLivros() {
        try {
            File f = new File("livros.txt");
            if (f.exists()) {
                Scanner fileSc = new Scanner(f);
                while (fileSc.hasNextLine()) {
                    livros.add(fileSc.nextLine());
                }
                fileSc.close();
            }
        } catch (Exception e) {
            System.out.println("Erro carregando: " + e.getMessage());
        }
    }
    private static void salvarLivros() {
        try {
            PrintWriter pw = new PrintWriter("livros.txt");
            for (String l : livros) {
                pw.println(l);
            }
            pw.close();
        } catch (Exception e) {
            System.out.println("Erro salvando!");
        }
    }
}