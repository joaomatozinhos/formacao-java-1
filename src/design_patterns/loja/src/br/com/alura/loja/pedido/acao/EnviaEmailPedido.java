package design_patterns.loja.src.br.com.alura.loja.pedido.acao;

import design_patterns.loja.src.br.com.alura.loja.pedido.Pedido;

public class EnviaEmailPedido implements AcaoAposGerarPedido {

	public void executaAcao(Pedido pedido) {
		System.out.println("Enviando email com dados do pedido..");
	}

}
