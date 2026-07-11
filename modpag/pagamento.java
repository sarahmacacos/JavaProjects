package modpag;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public interface pagamento {
    void pagar(double valor);

    default String recibo(double valor) {
        double taxa = taxaAplicada();
        double total = valor + (valor * taxa);
        String meio = this.getClass().getSimpleName();
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));

        return String.format("""
              --- RECIBO ---
                Meio: %s
                Valor: R$ %.2f
                Taxa: %.2f%%
                Total: R$ %.2f
                Data/Hora: %s
                ----------------
                """, meio, valor, taxa * 100, total, timestamp);
    }
    default double taxaAplicada() {
        return 0.0;
    }
}
