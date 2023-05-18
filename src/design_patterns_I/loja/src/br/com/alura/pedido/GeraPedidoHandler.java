package design_patterns_I.loja.src.br.com.alura.pedido;

import java.time.LocalDateTime;

import design_patterns_I.loja.src.br.com.alura.loja.orcamento.Orcamento;
import design_patterns_I.loja.src.br.com.alura.pedido.acao.EnviaEmailPedido;
import design_patterns_I.loja.src.br.com.alura.pedido.acao.SalvaPedidoNoBanco;

public class GeraPedidoHandler {

	// construtor com injecao de dependencias: repository, service, etc.

	public void execute(GeraPedido dados) {
		Orcamento orcamento = new Orcamento(dados.getValorDoOrcamento(), dados.getQuantidadeDeItens());

		Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

		EnviaEmailPedido email = new EnviaEmailPedido();
		email.executa(pedido);

		SalvaPedidoNoBanco salvaNoBanco = new SalvaPedidoNoBanco();
		salvaNoBanco.executa(pedido);
	}

}
