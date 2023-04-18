package projeto_screen_match.src.br.com.alura.screenmatch.principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import projeto_screen_match.src.br.com.alura.screenmatch.modelos.Filme;
import projeto_screen_match.src.br.com.alura.screenmatch.modelos.Serie;
import projeto_screen_match.src.br.com.alura.screenmatch.modelos.Titulo;

public class PrincipalComListas {

	public static void main(String[] args) {
		Filme meuFilme = new Filme("O Poderoso Chefão", 1970, 180);
		Filme outroFilme = new Filme("Avatar", 2023, 300);
		var filmeDoPaulo = new Filme("Dogville", 2003, 200);
		Serie lost = new Serie("Lost", 2000);

		List<Titulo> lista = new ArrayList<>();
		lista.add(filmeDoPaulo);
		lista.add(meuFilme);
		lista.add(outroFilme);
		lista.add(lost);

//		lista.forEach(filme -> System.out.println(filme));

		List<String> buscaPorArtista = new ArrayList<>();
		buscaPorArtista.add("Nicolas Cage");
		buscaPorArtista.add("Adam Sandler");
		buscaPorArtista.add("Will Smith");
		buscaPorArtista.add("Brad Pitt");
		buscaPorArtista.add("Tom Cruise");

		System.out.println("Antes da ordenação: " + buscaPorArtista);
		Collections.sort(buscaPorArtista);
		System.out.println("Depois da ordenação: " + buscaPorArtista);

		System.out.println("Lista de títulos ordenada por nome: ");
		Collections.sort(lista);
		System.out.println(lista);

		System.out.println("Lista de títulos ordenada por ano de lançamento: ");
		lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
		System.out.println(lista);
	}

}
