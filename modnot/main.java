package modnot;

public class main {
    public static void main(String[] args) {
        // Email + CSV
        notificador email = new emailnotificador();
        exportavel csv = new relatoriovendas();
        relatorioservico servico1 = new relatorioservico(email, csv);
        servico1.gerarEEnviar("sarahh@edu.unifil.br");

        System.out.println("\n-----------------\n");

        // SMS + JSON
        notificador sms = new smsnotificador();
        exportavel json = new relatorioestoque();
        relatorioservico servico2 = new relatorioservico(sms, json);
        servico2.gerarEEnviar("+55 43 998877-6655");
    }
}
