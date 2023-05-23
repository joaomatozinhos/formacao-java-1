package design_patterns.loja.src.br.com.alura.loja.http;

import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

public class JavaHttpClient implements HttpAdapter {

	@Override
	public void post(String url, Map<String, Object> dados) throws Exception {
		try {
			URL urlDaApi = new URL(url);
			URLConnection connection = urlDaApi.openConnection();
			connection.connect();
		} catch (Exception e) {
			throw new Exception("Erro ao enviar requisição HTTP", e);
		}

	}

}
