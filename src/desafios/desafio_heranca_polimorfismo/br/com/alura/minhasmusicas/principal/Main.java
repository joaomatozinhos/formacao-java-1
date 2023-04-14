package desafios.desafio_heranca_polimorfismo.br.com.alura.minhasmusicas.principal;

import desafios.desafio_heranca_polimorfismo.br.com.alura.minhasmusicas.modelos.MinhasPreferidas;
import desafios.desafio_heranca_polimorfismo.br.com.alura.minhasmusicas.modelos.Musica;
import desafios.desafio_heranca_polimorfismo.br.com.alura.minhasmusicas.modelos.Podcast;

public class Main {

	public static void main(String[] args) {
		Musica minhaMusica = new Musica();
		minhaMusica.setTitulo("Next to me");
		minhaMusica.setArtista("Rüfüs Du Sol");

		for (int i = 0; i < 1000; i++) {
			minhaMusica.reproduz();
		}

		for (int i = 0; i < 50; i++) {
			minhaMusica.curte();
		}

		Podcast meuPodcast = new Podcast();
		meuPodcast.setTitulo("Podpah");
		meuPodcast.setHost("Mitico & Igão");

		for (int i = 0; i < 5000; i++) {
			meuPodcast.reproduz();
		}

		for (int i = 0; i < 1000; i++) {
			meuPodcast.curte();
		}

		MinhasPreferidas preferidas = new MinhasPreferidas();
		preferidas.inclui(meuPodcast);
		preferidas.inclui(minhaMusica);

	}

}
