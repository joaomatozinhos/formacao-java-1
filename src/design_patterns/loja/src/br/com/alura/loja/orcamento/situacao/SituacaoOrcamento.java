package design_patterns.loja.src.br.com.alura.loja.orcamento.situacao;

import java.math.BigDecimal;

import design_patterns.loja.src.br.com.alura.loja.orcamento.Orcamento;

public abstract class SituacaoOrcamento {

	public BigDecimal calculaValorDoDescontoExtra(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}

	public void aprova(Orcamento orcamento) throws Exception {
		throw new Exception("Orçamento não pode ser aprovado!");
	}

	public void reprova(Orcamento orcamento) throws Exception {
		throw new Exception("Orçamento não pode ser reprovado!");
	}

	public void finaliza(Orcamento orcamento) throws Exception {
		throw new Exception("Orçamento não pode ser finalizado!");
	}

}
