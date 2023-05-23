package design_patterns.loja.src.br.com.alura.loja.orcamento;

import java.math.BigDecimal;

import design_patterns.loja.src.br.com.alura.loja.orcamento.situacao.EmAnalise;
import design_patterns.loja.src.br.com.alura.loja.orcamento.situacao.Finalizado;
import design_patterns.loja.src.br.com.alura.loja.orcamento.situacao.SituacaoOrcamento;

public class Orcamento {

	private BigDecimal valor;
	private int quantidadeDeItens;
	private SituacaoOrcamento situacao;

	public Orcamento(BigDecimal valor, int quantidadeDeItens) {
		this.valor = valor;
		this.quantidadeDeItens = quantidadeDeItens;
		this.situacao = new EmAnalise();
	}

	public BigDecimal getValor() {
		return valor;
	}

	public int getQuantidadeDeItens() {
		return quantidadeDeItens;
	}

	public void aplicaDescontoExtra() {
		BigDecimal valorDoDescontoExtra = this.situacao.calculaValorDoDescontoExtra(this);

		this.valor = this.valor.subtract(valorDoDescontoExtra);
	}

	public void aprova() throws Exception {
		this.situacao.aprova(this);
	}

	public void reprova() throws Exception {
		this.situacao.reprova(this);
	}

	public void finaliza() throws Exception {
		this.situacao.finaliza(this);
	}

	public void setSituacao(SituacaoOrcamento situacao) {
		this.situacao = situacao;

	}

	public boolean isFinalizado() {
		return situacao instanceof Finalizado;
	}

}
