package conta;

public class main {
    public static void main(String[] args) {
        conta conta1 = new conta("001", "Sarah", 50000.0);
        conta conta2 = new conta("002", "haras", 10000.0);

        System.out.println("Situação inicial:");
        System.out.println(conta1);
        System.out.println(conta2);
        System.out.println();

        conta1.depositar(200.0);
        conta2.depositar(500.0);
        conta1.sacar(100.0);
        conta2.sacar(2000.0);

        System.out.println("\nDepois das alterações:");
        System.out.println(conta1);
        System.out.println(conta2);
    }
}