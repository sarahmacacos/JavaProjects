package email;

public class relatoriovendas implements exportavel {
    @Override
    public String exportar() {
        return cabecalho() + "\nFormato: CSV\nDados: Produto, Quantidade, Valor\n";
    }
}
