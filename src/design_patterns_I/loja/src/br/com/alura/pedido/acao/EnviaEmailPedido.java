package design_patterns_I.loja.src.br.com.alura.pedido.acao;

import design_patterns_I.loja.src.br.com.alura.pedido.Pedido;

public class EnviaEmailPedido implements AcaoAposGerarPedido {

	public void executaAcao(Pedido pedido) {
		System.out.println("Enviando email com dados do pedido..");
	}

}
