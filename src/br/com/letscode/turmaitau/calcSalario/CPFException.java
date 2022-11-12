package br.com.letscode.turmaitau.calcSalario;

public class CPFException extends ValidacaoException {

    public CPFException(String mensagem) {
        super(mensagem);
    }

    public CPFException(String codigo, String mensagem) {
        super(codigo, mensagem);
    }

}
