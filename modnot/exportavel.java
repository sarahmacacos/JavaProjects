package modnot;

public interface exportavel {
    String exportar();
    default String cabecalho() {
        return "---EXPORT---";
    }
}

