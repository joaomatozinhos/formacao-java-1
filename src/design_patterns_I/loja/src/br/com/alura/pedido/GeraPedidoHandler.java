package design_patterns_I.loja.src.br.com.alura.pedido;

import java.time.LocalDateTime;

import design_patterns_I.loja.src.br.com.alura.loja.orcamento.Orcamento;

public class GeraPedidoHandler {

	// construtor com injecao de dependencias: repository, service, etc.

	public void execute(GeraPedido dados) {
		Orcamento orcamento = new Orcamento(dados.getValorDoOrcamento(), dados.getQuantidadeDeItens());

		Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);
	}

}
