package design_patterns_I.loja.src.br.com.alura.loja.orcamento.situacao;

import design_patterns_I.loja.src.br.com.alura.loja.orcamento.Orcamento;

public class Reprovado extends SituacaoOrcamento {

	public void finaliza(Orcamento orcamento) {
		orcamento.setSituacao(new Finalizado());
	}

}
