package lambda1;

public class Main3 {
    public static void main(String[] args) {
        double preco = 0;
try {
            preco = Double.parseDouble("1a");
        if (preco < 0) {
            System.out.println("Valor não pode ser negativo");
            throw new IllegalAccessException("Sistema Parado");
        }
    } catch (Exception e) {
        System.out.println(e);
    } finally {
        System.out.println("Execução finalizada.");
    }
}
}