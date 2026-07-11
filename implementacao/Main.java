package implementacao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        GerenciarVetor gv = new GerenciarVetor();
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n--- Menu GerenciarVetor ---");
            System.out.println("1 - Preencher manualmente");
            System.out.println("2 - Preencher aleatório");
            System.out.println("3 - Exibir (linha a linha)");
            System.out.println("4 - Exibir (inline)");
            System.out.println("5 - Ordenar crescente");
            System.out.println("6 - Ordenar decrescente");
            System.out.println("7 - Buscar valor");
            System.out.println("8 - Remover duplicatas");
            System.out.println("9 - Média");
            System.out.println("10 - Mínimo / Máximo");
            System.out.println("11 - Limpar vetores.vetor");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            int opt;
            try {
                opt = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Digite um número.");
                sc.nextLine();
                continue;
            }

            switch (opt) {
                case 1:
                    System.out.println("Preencha os valores:");
                    gv.preencherVetor(sc);
                    break;
                case 2:
                    try {
                        System.out.print("Valor mínimo: ");
                        int min = sc.nextInt();
                        System.out.print("Valor máximo: ");
                        int max = sc.nextInt();
                        gv.preencherAleatorio(min, max);
                        System.out.println("Preenchido aleatoriamente.");
                    } catch (InputMismatchException e) {
                        System.out.println("Entrada inválida para mínimo/máximo.");
                        sc.nextLine();
                    }
                    break;
                case 3:
                    gv.exibirVetor();
                    break;
                case 4:
                    gv.exibirVetorInline();
                    break;
                case 5:
                    gv.ordenarCrescente();
                    System.out.println("Ordenado crescente.");
                    break;
                case 6:
                    gv.ordenarDecrescente();
                    System.out.println("Ordenado decrescente.");
                    break;
                case 7:
                    try {
                        System.out.print("Valor a buscar: ");
                        int val = sc.nextInt();
                        int idx = gv.buscarLinear(val);
                        if (idx >= 0) System.out.println("Encontrado no índice " + idx);
                        else System.out.println("Não encontrado.");
                    } catch (InputMismatchException e) {
                        System.out.println("Entrada inválida.");
                        sc.nextLine();
                    }
                    break;
                case 8:
                    gv.removerDuplicatas();
                    System.out.println("Duplicatas removidas.");
                    break;
                case 9:
                    System.out.println("Média = " + gv.calcularMedia());
                    break;
                case 10:
                    System.out.println("Mínimo = " + gv.obterMinimo());
                    System.out.println("Máximo = " + gv.obterMaximo());
                    break;
                case 11:
                    gv.limparVetor();
                    System.out.println("vetorr.Vetor limpo.");
                    break;
                case 0:
                    running = false;
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }

        System.out.println("Saindo...");
        sc.close();
    }
}