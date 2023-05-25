package design_patterns.loja.src.br.com.alura.loja.orcamento;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import design_patterns.loja.src.br.com.alura.loja.orcamento.situacao.EmAnalise;
import design_patterns.loja.src.br.com.alura.loja.orcamento.situacao.Finalizado;
import design_patterns.loja.src.br.com.alura.loja.orcamento.situacao.SituacaoOrcamento;

public class Orcamento implements Orcavel {

	private BigDecimal valor;
	private SituacaoOrcamento situacao;
	private List<Orcavel> itens;

	public Orcamento() {
		this.valor = BigDecimal.ZERO;
		this.itens = new ArrayList<>();
		this.situacao = new EmAnalise();
	}

	public BigDecimal getValor() {
		return valor;
	}

	public int getQuantidadeDeItens() {
		return itens.size();
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

	public void adicionaItem(Orcavel item) {
		this.valor = valor.add(item.getValor());
		this.itens.add(item);
	}

}
