package design_patterns.loja.src.br.com.alura.loja.pedido.acao;

import design_patterns.loja.src.br.com.alura.loja.pedido.Pedido;

public class SalvaPedidoNoBanco implements AcaoAposGerarPedido {

	public void executaAcao(Pedido pedido) {
		System.out.println("Salvando pedido no banco de dados..");
	}

}
