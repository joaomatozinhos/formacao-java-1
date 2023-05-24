package design_patterns.loja.src.br.com.alura.loja;

import java.math.BigDecimal;

import design_patterns.loja.src.br.com.alura.loja.http.JavaHttpClient;
import design_patterns.loja.src.br.com.alura.loja.orcamento.ItemOrcamento;
import design_patterns.loja.src.br.com.alura.loja.orcamento.Orcamento;
import design_patterns.loja.src.br.com.alura.loja.orcamento.RegistroDeOrcamento;

public class TestaAdapter {

	public static void main(String[] args) throws Exception {

		try {
			Orcamento orcamento = new Orcamento();
			orcamento.adicionaItem(new ItemOrcamento(BigDecimal.TEN));

			orcamento.aprova();
			orcamento.finaliza();

			RegistroDeOrcamento registro = new RegistroDeOrcamento(new JavaHttpClient());
			registro.registra(orcamento);
		} catch (Exception e) {
			throw new Exception(e);
		}

	}

}
