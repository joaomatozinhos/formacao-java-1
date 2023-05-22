package design_patterns.loja.src.br.com.alura.loja.orcamento.situacao;

import java.math.BigDecimal;

import design_patterns.loja.src.br.com.alura.loja.orcamento.Orcamento;

public class EmAnalise extends SituacaoOrcamento {

	public BigDecimal calculaValorDoDescontoExtra(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.05"));
	}

	public void aprova(Orcamento orcamento) {
		orcamento.setSituacao(new Aprovado());
	}

	public void reprova(Orcamento orcamento) {
		orcamento.setSituacao(new Reprovado());
	}

}
