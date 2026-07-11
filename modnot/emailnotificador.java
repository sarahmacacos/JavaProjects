package modnot;

public class emailnotificador implements notificador {
    @Override
    public void enviar(String destino, String mensagem) {
        System.out.println("Enviando email para " + destino + ": " + mensagem);
    }
}