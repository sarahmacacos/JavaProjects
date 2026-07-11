package modnot;

public class relatoriovendas implements exportavel {
    @Override
    public String exportar() {
        return cabecalho() + "\nFormato CSV: Produto, Quantidade, Valor";
    }
}
