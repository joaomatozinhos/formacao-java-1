package design_patterns.loja.src.br.com.alura.loja.orcamento;

import java.util.Map;

import design_patterns.loja.src.br.com.alura.loja.http.HttpAdapter;

public class RegistroDeOrcamento {

	private HttpAdapter http;

	public RegistroDeOrcamento(HttpAdapter http) {
		this.http = http;
	}

	public void registra(Orcamento orcamento) throws Exception {

		if (!orcamento.isFinalizado()) {
			throw new Exception("Orçamento não finalizado!");
		}

		String url = "http://api.externa/orcamento";
		Map<String, Object> dados = Map.of("valor", orcamento.getValor(), "quantidadeDeItens",
				orcamento.getQuantidadeDeItens());

		http.post(url, dados);
	}

}
