package design_patterns.loja.src.br.com.alura.loja.imposto;

import java.math.BigDecimal;

import design_patterns.loja.src.br.com.alura.loja.orcamento.Orcamento;

public class ICMS extends Imposto {

	public ICMS(Imposto outro) {
		super(outro);
	}

	@Override
	public BigDecimal realizaCalculo(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.1"));
	}

}
