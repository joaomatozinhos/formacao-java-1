package projeto_screen_match.src.br.com.alura.screenmatch.excecao;

public class ErroDeConversaoDeAnoException extends Exception {
	private String mensagem;

	public ErroDeConversaoDeAnoException(String mensagem) {
		this.mensagem = mensagem;
	}

	@Override
	public String getMessage() {
		return this.mensagem;
	}
}
