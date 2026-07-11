package S;

class UsuarioValidator {
    public boolean validar(String nome) {
        return !nome.isEmpty();
    }
}
class UsuarioRepository {
    public void salvar() {
        System.out.println("Salvando no banco...");
    }
}
class EmailService {
    public void enviar() {
        System.out.println("Enviando email...");
    }
}
class UsuarioService {

    UsuarioValidator validator = new UsuarioValidator();
    UsuarioRepository repo = new UsuarioRepository();
    EmailService email = new EmailService();

    public void cadastrar(String nome) {

        if (!validator.validar(nome)) return;

        repo.salvar();
        email.enviar();
    }
}
