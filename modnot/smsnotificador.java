package modnot;

public class smsnotificador implements notificador {
    @Override
    public void enviar(String destino, String mensagem) {
        System.out.println("Enviando SMS para " + destino + ": " + mensagem);
    }
}