package erros;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite o 1° número: ");
            int a = sc.nextInt();

            System.out.print("Digite o 2° número: ");
            int b = sc.nextInt();

            if (b == 0) {
                throw new ArithmeticException("Erro: Não é permitido divisão por zero!");
            }

            int resultado = a / b;
            System.out.println("Resultado: " + resultado);

        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida! Apenas números inteiros.");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro.");
        } finally {
            System.out.println("Operação finalizada.");
        }
        sc.close();
    }
}
