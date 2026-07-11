package formageometrica;

public class triangulo extends formageometrica {
    private double base;
    private double altura;

    public triangulo(double base, double altura) {
        super("Triângulo");
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }
    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
    public void mostrarDados() {
        System.out.println("Forma: " + getNome());
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
        System.out.println("Área: " + calcularArea());
        System.out.println("--------------------");
    }
}
