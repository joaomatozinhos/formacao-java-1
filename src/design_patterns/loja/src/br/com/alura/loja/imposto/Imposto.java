package design_patterns.loja.src.br.com.alura.loja.imposto;

import java.math.BigDecimal;

import design_patterns.loja.src.br.com.alura.loja.orcamento.Orcamento;

public abstract class Imposto {

	private Imposto outro;

	public Imposto(Imposto outro) {
		this.outro = outro;
	}

	public abstract BigDecimal realizaCalculo(Orcamento orcamento);

	public BigDecimal calcula(Orcamento orcamento) {
		BigDecimal valorImposto = realizaCalculo(orcamento);
		BigDecimal valorOutroImposto = BigDecimal.ZERO;

		if (outro != null) {
			valorOutroImposto = outro.realizaCalculo(orcamento);
		}

		return valorImposto.add(valorOutroImposto);
	}

}
