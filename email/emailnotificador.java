package email;

public class emailnotificador implements notificador {
    @Override
    public void enviar(String destino, String mensagem) {
        System.out.println("Enviando E-MAIL para " + destino);
        System.out.println("Conteúdo:\n" + mensagem);
        System.out.println();
    }
}

