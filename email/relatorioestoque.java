package email;

public class relatorioestoque implements exportavel {
    @Override
    public String exportar() {
        return cabecalho() + "\nFormato: JSON\nDados: {\"item\": \"Notebook\", \"qtd\": 50}\n";
    }
}
