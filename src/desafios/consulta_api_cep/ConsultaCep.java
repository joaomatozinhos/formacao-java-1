package desafios.consulta_api_cep;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

import com.google.gson.Gson;

public class ConsultaCep {

	public Endereco buscaEndereco(String cep) throws Exception {
		String url = "http://viacep.com.br/ws/" + cep + "/json/";

		try {
			HttpClient client = HttpClient.newHttpClient();
			HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();
			HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
			String json = response.body();

			return new Gson().fromJson(json, Endereco.class);

		} catch (Exception e) {
			throw new Exception("Não foi possível obter o endereço a partir desse CEP.");
		}
	}

}
