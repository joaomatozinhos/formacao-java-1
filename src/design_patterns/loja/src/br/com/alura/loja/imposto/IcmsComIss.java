package design_patterns.loja.src.br.com.alura.loja.imposto;

import java.math.BigDecimal;

import design_patterns.loja.src.br.com.alura.loja.orcamento.Orcamento;

public class IcmsComIss implements Imposto {

	@Override
	public BigDecimal calcula(Orcamento orcamento) {
		BigDecimal icms = new ICMS().calcula(orcamento);
		BigDecimal iss = new ISS().calcula(orcamento);

		return icms.add(iss);
	}

}
