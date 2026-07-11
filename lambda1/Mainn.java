package lambda1;

public class Mainn {
    public static void main(String[] args) {
        String texto = "10a";
        try {
            int valor = Integer.parseInt(texto);
            System.out.println(valor);
        } catch (NumberFormatException e) {
            System.out.println(e);
        } finally {
            System.out.println("Tentativa de conversão.");
        }

    }
}
