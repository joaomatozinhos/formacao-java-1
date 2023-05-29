package design_patterns.loja.src.br.com.alura.loja;

import java.math.BigDecimal;

import design_patterns.loja.src.br.com.alura.loja.orcamento.ItemOrcamento;
import design_patterns.loja.src.br.com.alura.loja.orcamento.Orcamento;
import design_patterns.loja.src.br.com.alura.loja.orcamento.OrcamentoProxy;

public class TestaComposicao {

	public static void main(String[] args) throws Exception {

		Orcamento antigo = new Orcamento();
		antigo.adicionaItem(new ItemOrcamento(new BigDecimal("200")));
		antigo.reprova();

		Orcamento novo = new Orcamento();
		novo.adicionaItem(new ItemOrcamento(new BigDecimal("500")));
		novo.adicionaItem(antigo);

		OrcamentoProxy proxy = new OrcamentoProxy(novo);

		System.out.println(proxy.getValor());
		System.out.println(proxy.getValor());
		System.out.println(proxy.getValor());
		System.out.println(proxy.getValor());
		System.out.println(proxy.getValor());
		
		// a primeira chamada demora um pouco, mas as outras são instantâneas, devido ter aplicado o padrão proxy e portanto já estar em "cache"

	}

}
