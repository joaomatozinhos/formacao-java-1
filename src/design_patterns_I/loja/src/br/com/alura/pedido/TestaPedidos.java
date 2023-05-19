package design_patterns_I.loja.src.br.com.alura.pedido;

import java.math.BigDecimal;
import java.util.Arrays;

import design_patterns_I.loja.src.br.com.alura.pedido.acao.EnviaEmailPedido;
import design_patterns_I.loja.src.br.com.alura.pedido.acao.SalvaPedidoNoBanco;

public class TestaPedidos {

	public static void main(String[] args) {
		String cliente = "Emerson Teixeira";
		BigDecimal valorDoOrcamento = new BigDecimal("3460");
		int quantidadeDeItens = 70;

		GeraPedido gerador = new GeraPedido(cliente, valorDoOrcamento, quantidadeDeItens);
		GeraPedidoHandler handler = new GeraPedidoHandler(
				Arrays.asList(new EnviaEmailPedido(), new SalvaPedidoNoBanco()));
		handler.execute(gerador);
	}

}
