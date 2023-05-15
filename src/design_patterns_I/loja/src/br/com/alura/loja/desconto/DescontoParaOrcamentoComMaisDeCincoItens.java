package design_patterns_I.loja.src.br.com.alura.loja.desconto;

import java.math.BigDecimal;

import design_patterns_I.loja.src.br.com.alura.loja.orcamento.Orcamento;

public class DescontoParaOrcamentoComMaisDeCincoItens extends Desconto {

	public DescontoParaOrcamentoComMaisDeCincoItens(Desconto proximo) {
		super(proximo);
	}

	public BigDecimal calcula(Orcamento orcamento) {
		if (orcamento.getQuantidadeDeItens() > 5) {
			return orcamento.getValor().multiply(new BigDecimal("0.1"));
		}

		return proximo.calcula(orcamento);
	}

}
