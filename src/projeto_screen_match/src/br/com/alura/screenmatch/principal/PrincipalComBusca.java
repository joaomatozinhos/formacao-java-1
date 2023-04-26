package projeto_screen_match.src.br.com.alura.screenmatch.principal;

import java.io.File;
import java.io.FileWriter;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
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
		System.out.println("Digite o título de um filme para busca: ");
		String tituloDoFilme = leitura.nextLine();

		leitura.close();

		String url = "https://www.omdbapi.com/?t=" + tituloDoFilme.replace(" ", "+") + "&apikey=d7254e91";

		try {

			HttpClient client = HttpClient.newHttpClient();
			HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();
			HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
			String json = response.body();

			System.out.println(json);

			// Gson gson = new Gson();
			// Titulo meuTitulo = gson.fromJson(json, Titulo.class);

			Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
			TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
			System.out.println(meuTituloOmdb);

			Titulo meuTitulo = new Titulo(meuTituloOmdb);
			System.out.println(meuTitulo);

			FileWriter escrita = new FileWriter("filmes.txt");
			escrita.write(meuTitulo.toString());
			escrita.close();
		} catch (NumberFormatException e) {
			System.out.println("Aconteceu um erro: ");
			System.out.println(e.getMessage());
		} catch (IllegalArgumentException e) {
			System.out.println("Ocorreu um erro de argumento na busca, verifique o endereço.");
			System.out.println(e.getMessage());
		} catch (ErroDeConversaoDeAnoException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("O programa finalizou.");

		Scanner scanner = new Scanner(new File("filmes.txt"));

		while (scanner.hasNextLine()) {
			String linha = scanner.nextLine();
			System.out.println(linha);
		}

		scanner.close();

	}

}