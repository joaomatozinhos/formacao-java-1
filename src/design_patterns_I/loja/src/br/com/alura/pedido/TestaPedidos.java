package design_patterns_I.loja.src.br.com.alura.pedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import design_patterns_I.loja.src.br.com.alura.loja.orcamento.Orcamento;

public class TestaPedidos {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(new BigDecimal("600"), 4);
		String cliente = "Jorge Santos";
		LocalDateTime data = LocalDateTime.now();

		Pedido pedido = new Pedido(cliente, data, orcamento);
	}

}
