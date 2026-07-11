package empresa;

public class gerente extends funcionario {
    private String codigoAcesso;

    public gerente() {}

    public gerente(String nome, double salario, String codigoAcesso) {
        super(nome, salario);
        this.codigoAcesso = codigoAcesso;
    }

    public String getCodigoAcesso() {
        return codigoAcesso;
    }

    public void setCodigoAcesso(String codigoAcesso) {
        this.codigoAcesso = codigoAcesso;
    }

    public boolean validarAcesso(String codigo) {
        return codigoAcesso != null && codigoAcesso.equals(codigo);
    }

    @Override
    public double calcularBonus() {
        return getSalario() * 0.25;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCódigo de Acesso: " + codigoAcesso;
    }
}
