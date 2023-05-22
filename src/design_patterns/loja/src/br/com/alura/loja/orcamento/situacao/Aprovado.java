package design_patterns.loja.src.br.com.alura.loja.orcamento.situacao;

import java.math.BigDecimal;

import design_patterns.loja.src.br.com.alura.loja.orcamento.Orcamento;

public class Aprovado extends SituacaoOrcamento {

	public BigDecimal calculaValorDoDescontoExtra(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.02"));
	}

	public void finaliza(Orcamento orcamento) {
		orcamento.setSituacao(new Finalizado());
	}

}
