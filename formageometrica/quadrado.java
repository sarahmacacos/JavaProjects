package formageometrica;

public class quadrado extends formageometrica {
    private double lado;

    public quadrado(double lado) {
        super("Quadrado");
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    public void mostrarDados() {
        System.out.println("Forma: " + getNome());
        System.out.println("Lado: " + lado);
        System.out.println("Área: " + calcularArea());
        System.out.println("--------------------");
    }
}
