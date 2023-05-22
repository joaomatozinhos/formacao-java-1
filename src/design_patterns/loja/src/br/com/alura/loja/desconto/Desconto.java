package design_patterns.loja.src.br.com.alura.loja.desconto;

import java.math.BigDecimal;

import design_patterns.loja.src.br.com.alura.loja.orcamento.Orcamento;

public abstract class Desconto {

	protected Desconto proximo;

	public Desconto(Desconto proximo) {
		this.proximo = proximo;
	}

	public BigDecimal calcula(Orcamento orcamento) {
		if (deveAplicar(orcamento)) {
			return efetuaCalculo(orcamento);
		}

		return proximo.calcula(orcamento);
	}

	protected abstract BigDecimal efetuaCalculo(Orcamento orcamento);

	protected abstract boolean deveAplicar(Orcamento orcamento);

}
