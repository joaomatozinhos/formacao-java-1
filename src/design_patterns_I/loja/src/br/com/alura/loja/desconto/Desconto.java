package design_patterns_I.loja.src.br.com.alura.loja.desconto;

import java.math.BigDecimal;

import design_patterns_I.loja.src.br.com.alura.loja.orcamento.Orcamento;

public abstract class Desconto {

	protected Desconto proximo;

	public Desconto(Desconto proximo) {
		this.proximo = proximo;
	}

	public abstract BigDecimal calcula(Orcamento orcamento);

}
