package jdbc.bytebank.src.main.java.br.com.alura.bytebank.domain;

public class RegraDeNegocioException extends RuntimeException {
	public RegraDeNegocioException(String mensagem) {
		super(mensagem);
	}
}
