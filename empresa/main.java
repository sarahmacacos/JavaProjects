package empresa;

public class main {
    public static void main(String[] args) {
        funcionario gerente = new gerente("Sarah", 100000.0, "senha321");
        funcionario funcionario = new funcionario("Maria", 30000.0);
        funcionario assistente = new secretaria("Bartholomeu", 12000.0);

        System.out.println("=== GERENTE ===\n" + gerente);
        System.out.println("\n=== FUNCIONÁRIO ===\n" + funcionario);
        System.out.println("\n=== ASSISTENTE ===\n" + assistente);
    }
}
