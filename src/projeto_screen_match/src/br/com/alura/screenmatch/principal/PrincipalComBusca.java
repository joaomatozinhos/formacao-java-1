package projeto_screen_match.src.br.com.alura.screenmatch.principal;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class PrincipalComBusca {

	public static void main(String[] args) throws Exception {
		String url = "https://www.omdbapi.com/?t=top+gun&apikey=d7254e91";

		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();
		HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
		String json = response.body();

		System.out.println(json);
	}

}