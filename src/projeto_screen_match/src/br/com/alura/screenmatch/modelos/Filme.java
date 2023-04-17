package projeto_screen_match.src.br.com.alura.screenmatch.modelos;

import projeto_screen_match.src.br.com.alura.screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
	private String diretor;

	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}

	@Override
	public int getClassificacao() {
		return (int) pegaMedia() / 2;
	}

	@Override
	public String toString() {
		return "Filme: " + this.getNome() + " (" + this.getAnoDeLancamento() + ")";
	}
}
