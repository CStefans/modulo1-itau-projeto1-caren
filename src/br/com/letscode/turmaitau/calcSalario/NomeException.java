package br.com.letscode.turmaitau.calcSalario;

public class NomeException extends ValidacaoException {

    public NomeException(String mensagem) {
        super(mensagem);
    }

    public NomeException(String codigo, String mensagem) {
        super(codigo, mensagem);
    }

}
