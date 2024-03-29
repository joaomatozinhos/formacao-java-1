package design_patterns.loja.src.br.com.alura.loja.pedido;

import java.math.BigDecimal;
import java.util.Arrays;

import design_patterns.loja.src.br.com.alura.loja.pedido.acao.EnviaEmailPedido;
import design_patterns.loja.src.br.com.alura.loja.pedido.acao.SalvaPedidoNoBanco;

public class TestaPedidos {

	public static void main(String[] args) {
		String cliente = "Emerson Teixeira";
		BigDecimal valorDoOrcamento = new BigDecimal("3460");
		int quantidadeDeItens = 70;

		GeraPedido gerador = new GeraPedido(cliente, valorDoOrcamento, quantidadeDeItens);
		GeraPedidoHandler handler = new GeraPedidoHandler(
				Arrays.asList(new EnviaEmailPedido(), new SalvaPedidoNoBanco()));
		
		// A classe GeraPedidoHandler com seu método executa() atua como fachada (padrão facade), pois encapsula todas as ações que devem ser realizadas após gerar um pedido, sem que o cliente saiba quais são elas e os detalhes internos.
		handler.executa(gerador);
	}

}
