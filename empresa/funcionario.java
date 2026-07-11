package empresa;

public class funcionario {
    private String nome;
    private double salario;

    public funcionario() {}

    public funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double calcularBonus() {
        return salario * 0.1;
    }

    @Override
    public String toString() {
        return String.format(
                "Nome: %s\nSalário: R$%.2f\nBônus: R$%.2f",
                nome, salario, calcularBonus()
        );
    }
}
