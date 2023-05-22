package design_patterns_I.loja.src.br.com.alura.loja.pedido;

import java.math.BigDecimal;

public class GeraPedido {

	private String cliente;
	private BigDecimal valorDoOrcamento;
	private int quantidadeDeItens;

	public GeraPedido(String cliente, BigDecimal valorDoOrcamento, int quantidadeDeItens) {
		this.cliente = cliente;
		this.valorDoOrcamento = valorDoOrcamento;
		this.quantidadeDeItens = quantidadeDeItens;
	}

	public String getCliente() {
		return cliente;
	}

	public BigDecimal getValorDoOrcamento() {
		return valorDoOrcamento;
	}

	public int getQuantidadeDeItens() {
		return quantidadeDeItens;
	}

}
