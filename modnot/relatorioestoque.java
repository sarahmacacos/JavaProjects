package modnot;

public class relatorioestoque implements exportavel {
    @Override
    public String exportar() {
        return cabecalho() + "\nFormato JSON: {estoque:[{produto:'X',quantidade:10}]}";
    }
}