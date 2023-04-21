package projeto_screen_match.src.br.com.alura.screenmatch.principal;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import projeto_screen_match.src.br.com.alura.screenmatch.modelos.Titulo;

public class PrincipalComBusca {

	public static void main(String[] args) throws Exception {
		Scanner leitura = new Scanner(System.in);
		System.out.println("Digite o título de um filme para busca: ");
		String tituloDoFilme = leitura.nextLine();

		leitura.close();

		String url = "https://www.omdbapi.com/?t=" + tituloDoFilme + "&apikey=d7254e91";

		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();
		HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
		String json = response.body();

		System.out.println(json);

		Gson gson = new GsonBuilder().create();
		Titulo meuTitulo = gson.fromJson(json, Titulo.class);
		System.out.println("Título: " + meuTitulo.getNome());

	}

}