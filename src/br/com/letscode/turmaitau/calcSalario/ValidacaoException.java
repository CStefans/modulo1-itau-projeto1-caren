package br.com.letscode.turmaitau.calcSalario;

public class ValidacaoException extends Exception {

    private String codigo;

    public ValidacaoException(String mensagem) {
        super(mensagem);
    }

    public ValidacaoException(String codigo, String mensagem) {
        super(mensagem);
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }
}
