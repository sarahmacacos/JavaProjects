package modnot;

public class relatorioservico {
    private notificador notificador;
    private exportavel exportavel;

    public relatorioservico(notificador notificador, exportavel exportavel) {
        this.notificador = notificador;
        this.exportavel = exportavel;
    }

    public void gerarEEnviar(String destino) {
        String conteudo = exportavel.exportar();
        notificador.enviar(destino, conteudo);
    }
}

