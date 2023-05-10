package solid.rh.src.br.com.alura.rh.service.reajuste;

import java.math.BigDecimal;

import solid.rh.src.br.com.alura.rh.model.Funcionario;

public interface ValidacaoReajuste {

	void valida(Funcionario funcionario, BigDecimal aumento);

}
