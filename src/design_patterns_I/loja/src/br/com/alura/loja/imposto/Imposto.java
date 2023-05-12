package design_patterns_I.loja.src.br.com.alura.loja.imposto;

import java.math.BigDecimal;

import design_patterns_I.loja.src.br.com.alura.loja.orcamento.Orcamento;

public interface Imposto {

	public BigDecimal calcula(Orcamento orcamento);

}
