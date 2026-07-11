package email;

public class smsnotificador implements notificador {
    @Override
    public void enviar(String destino, String mensagem) {
        System.out.println("Enviando SMS para " + destino);
        System.out.println("Conteúdo:\n" + mensagem);
        System.out.println();
    }
}
