package conteudo_extra.api.src;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class Api {
	public static void main(String[] args) throws Exception {

		String url = "https://servicodados.ibge.gov.br/api/v3/agregados?periodo=P5[202001]";
		HttpClient cliente = HttpClient.newHttpClient();
		HttpRequest requisicao = HttpRequest.newBuilder(URI.create(url)).GET().build();
		HttpResponse<String> resposta = cliente.send(requisicao, BodyHandlers.ofString());
		String json = resposta.body();
		System.out.println(json);
	}
}
