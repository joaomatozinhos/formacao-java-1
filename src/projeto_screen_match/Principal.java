package projeto_screen_match;

import java.util.ArrayList;

import projeto_screen_match.src.br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import projeto_screen_match.src.br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import projeto_screen_match.src.br.com.alura.screenmatch.modelos.Episodio;
import projeto_screen_match.src.br.com.alura.screenmatch.modelos.Filme;
import projeto_screen_match.src.br.com.alura.screenmatch.modelos.Serie;

public class Principal {
	public static void main(String[] args) {
		Filme meuFilme = new Filme("O Poderoso Chefão", 1970, 180);
		System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

		meuFilme.exibeFichaTecnica();
		meuFilme.avalia(8);
		meuFilme.avalia(5);
		meuFilme.avalia(10);
		System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
		System.out.println(meuFilme.pegaMedia());

		Serie lost = new Serie("Lost", 2000);
		lost.exibeFichaTecnica();
		lost.setTemporadas(10);
		lost.setEpisodiosPorTemporada(10);
		lost.setMinutosPorEpisodio(50);
		System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());

		Filme outroFilme = new Filme("Avatar", 2023, 300);

		CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
		calculadora.inclui(meuFilme);
		calculadora.inclui(outroFilme);
		calculadora.inclui(lost);
		System.out.println(calculadora.getTempoTotal());

		FiltroRecomendacao filtro = new FiltroRecomendacao();
		filtro.filtra(meuFilme);

		Episodio episodio = new Episodio();
		episodio.setNumero(1);
		episodio.setSerie(lost);
		episodio.setTotalVisualizacoes(300);
		filtro.filtra(episodio);

		Filme filmeDoPaulo = new Filme("Dogville", 2003, 200);
		filmeDoPaulo.avalia(10);

		ArrayList<Filme> listaDeFilmes = new ArrayList<>();
		listaDeFilmes.add(meuFilme);
		listaDeFilmes.add(outroFilme);
		listaDeFilmes.add(filmeDoPaulo);

		System.out.println("Quantidade de filmes na lista: " + listaDeFilmes.size());

		listaDeFilmes.forEach(filme -> System.out.println(filme));
	}
}
