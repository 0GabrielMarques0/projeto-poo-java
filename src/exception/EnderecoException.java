package exception;

public class EnderecoException extends Exception {
    public EnderecoException() {
        super("Todos os campos do endereço devem ser preenchidos");
    }
}
