package alupess;

class Aluno extends Pessoa {
    private String matricula;
    public Aluno(String nome, String email, String matricula) {
        super(nome, email);
        this.matricula = matricula;
    }
    public String getMatricula() {
        return matricula;
    }
}
class Professor extends Pessoa {
    private double salario;
    public Professor(String nome, String email, double salario) {
        super(nome, email);
        this.salario = salario;
    }
    public double getSalario() {
        return salario;
    }
}