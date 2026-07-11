package email;

interface exportavel {
    String exportar();

    default String cabecalho() {
        return "---EXPORT---";
    }
}
