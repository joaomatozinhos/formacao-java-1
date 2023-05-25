package design_patterns.loja.src.br.com.alura.loja;

import java.math.BigDecimal;

import design_patterns.loja.src.br.com.alura.loja.orcamento.ItemOrcamento;
import design_patterns.loja.src.br.com.alura.loja.orcamento.Orcamento;

public class TestaComposicao {

	public static void main(String[] args) throws Exception {

		Orcamento antigo = new Orcamento();
		antigo.adicionaItem(new ItemOrcamento(new BigDecimal("200")));
		antigo.reprova();

		Orcamento novo = new Orcamento();
		novo.adicionaItem(new ItemOrcamento(new BigDecimal("500")));
		novo.adicionaItem(antigo);
		
		System.out.println(novo.getValor());

	}

}
