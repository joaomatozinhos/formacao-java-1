package design_patterns_I.loja.src.br.com.alura.pedido;

import java.math.BigDecimal;

public class TestaPedidos {

	public static void main(String[] args) {
		String cliente = args[0];
		BigDecimal valorDoOrcamento = new BigDecimal(args[1]);
		int quantidadeDeItens = Integer.parseInt(args[2]);

		GeraPedido gerador = new GeraPedido(cliente, valorDoOrcamento, quantidadeDeItens);
		GeraPedidoHandler handler = new GeraPedidoHandler();
		handler.execute(gerador);
	}

}
