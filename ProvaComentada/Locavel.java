package ProvaComentada;

public interface Locavel {
    double calcularValorAluguel(int dias) throws IllegalArgumentException; // calcula preço pelo número de dias
    void alugar() throws IllegalStateException; // marca o objeto como "locado"
    void devolver() throws IllegalStateException; // marca como "não locado"
    boolean isLocado(); // diz se está locado ou não
}
