package email;

public class apprelatoriosimples {
    public static void main(String[] args) {

        // E-mail + CSV
        notificador email = new emailnotificador();
        exportavel vendas = new relatoriovendas();
        relatorioservico service1 = new relatorioservico(email, vendas);
        service1.gerarEEnviar("sarah@edu.unifil.br");

        // SMS + JSON
        notificador sms = new smsnotificador();
        exportavel estoque = new relatorioestoque();
        relatorioservico servico2 = new relatorioservico(sms, estoque);
        servico2.gerarEEnviar("+55 43 99999-9999");
    }
}
