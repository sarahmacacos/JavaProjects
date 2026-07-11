package alupess;
public class main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Sarah Paiola", "sarahh@unifil.br", "251041031");
        Professor professor = new Professor("Marcelo Yamamoto", "Marcelo.Yamamoto@unifil.br", 500000.00);

        System.out.println("Dados do Aluno:");
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Email: " + aluno.getEmail());
        System.out.println("Matrícula: " + aluno.getMatricula());
        System.out.println();
        System.out.println("Dados do Professor:");
        System.out.println("Nome: " + professor.getNome());
        System.out.println("Email: " + professor.getEmail());
        System.out.println("Salário: " + professor.getSalario());
    }
}

