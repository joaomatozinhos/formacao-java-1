package desafios.desafio_ordenar_listas;

public class Compra implements Comparable<Compra> {

	private String descricao;
	private double valor;

	public Compra(String descricao, double valor) {
		this.descricao = descricao;
		this.valor = valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public double getValor() {
		return valor;
	}

	@Override
	public int compareTo(Compra outraCompra) {
		if (this.getValor() < outraCompra.getValor()) {
			return 1;
		}

		if (this.getValor() > outraCompra.getValor()) {
			return -1;
		}

		return 0;

	}
}
