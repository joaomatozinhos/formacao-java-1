package design_patterns_I.loja.src.br.com.alura.loja.desconto;

import java.math.BigDecimal;

import design_patterns_I.loja.src.br.com.alura.loja.orcamento.Orcamento;

public class SemDesconto extends Desconto {

	public SemDesconto() {
		super(null);
	}

	public BigDecimal calcula(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}

}
