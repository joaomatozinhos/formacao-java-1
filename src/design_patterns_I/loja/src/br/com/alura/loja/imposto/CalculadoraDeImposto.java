package design_patterns_I.loja.src.br.com.alura.loja.imposto;

import java.math.BigDecimal;

import design_patterns_I.loja.src.br.com.alura.loja.orcamento.Orcamento;

public class CalculadoraDeImposto {

	public BigDecimal calcula(Orcamento orcamento, TipoImposto tipoImposto) {
		switch (tipoImposto) {
		case ICMS: {
			return orcamento.getValor().multiply(new BigDecimal("0.1"));
		}
		case ISS: {
			return orcamento.getValor().multiply(new BigDecimal("0.06"));
		}
		default:
			return BigDecimal.ZERO;
		}
	}

}
