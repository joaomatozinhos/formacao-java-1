package design_patterns.loja.src.br.com.alura.loja.pedido;

import java.time.LocalDateTime;
import java.util.List;

import design_patterns.loja.src.br.com.alura.loja.orcamento.Orcamento;
import design_patterns.loja.src.br.com.alura.loja.pedido.acao.AcaoAposGerarPedido;

public class GeraPedidoHandler {

	private List<AcaoAposGerarPedido> acoes;

	public GeraPedidoHandler(List<AcaoAposGerarPedido> acoes) {
		this.acoes = acoes;
	}

	public void execute(GeraPedido dados) {
		Orcamento orcamento = new Orcamento(dados.getValorDoOrcamento(), dados.getQuantidadeDeItens());

		Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);
		
		acoes.forEach(a -> a.executaAcao(pedido));
	}

}