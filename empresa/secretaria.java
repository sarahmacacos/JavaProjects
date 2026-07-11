package empresa;

public class secretaria extends funcionario {
    public secretaria() {}

    public secretaria(String nome, double salario) {
        super(nome, salario);
    }
    @Override
    public double calcularBonus() {
        return getSalario() * 0.12;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
