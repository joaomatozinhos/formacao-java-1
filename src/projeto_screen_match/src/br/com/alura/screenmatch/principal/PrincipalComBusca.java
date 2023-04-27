package projeto_screen_match.src.br.com.alura.screenmatch.principal;

import java.io.FileWriter;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import projeto_screen_match.src.br.com.alura.screenmatch.excecao.ErroDeConversaoDeAnoException;
import projeto_screen_match.src.br.com.alura.screenmatch.modelos.Titulo;
import projeto_screen_match.src.br.com.alura.screenmatch.modelos.TituloOmdb;

public class PrincipalComBusca {

	public static void main(String[] args) throws Exception {
		Scanner leitura = new Scanner(System.in);
		String busca = "";
		List<Titulo> listaDeTitulos = new ArrayList<>();

		Gson gson = new GsonBuilder()
			.setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
			.setPrettyPrinting()
			.create();

		while (!busca.equals("sair")) {
			System.out.println("Digite o título de um filme para busca: ");
			busca = leitura.nextLine();

			if (busca.equals("sair")) {
				leitura.close();
				break;
			}

			String url = "https://www.omdbapi.com/?t=" + busca.replace(" ", "+") + "&apikey=d7254e91";

			try {
				HttpClient client = HttpClient.newHttpClient();
				HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();
				HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
				String json = response.body();
				// System.out.println(json);

				TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
				Titulo meuTitulo = new Titulo(meuTituloOmdb);
				listaDeTitulos.add(meuTitulo);

			} catch (NumberFormatException e) {
				System.out.println("Aconteceu um erro: ");
				System.out.println(e.getMessage());
			} catch (IllegalArgumentException e) {
				System.out.println("Ocorreu um erro de argumento na busca, verifique o endereço.");
				System.out.println(e.getMessage());
			} catch (ErroDeConversaoDeAnoException e) {
				System.out.println(e.getMessage());
			}

		}

		System.out.println(listaDeTitulos);

		String jsonFilmes = gson.toJson(listaDeTitulos);

		FileWriter escrita = new FileWriter("filmes.json");
		escrita.write(jsonFilmes);
		escrita.close();

		System.out.println("O programa finalizou.");

	}

}