package desafios.desafio_ordenar_listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cartao {

	private double limite;
	private double saldo;
	private List<Compra> extratoDeCompras = new ArrayList<>();

	public Cartao(double limite) {
		this.limite = limite;
		this.saldo = this.limite;
	}

	public double getLimite() {
		return limite;
	}

	public double getSaldo() {
		return saldo;
	}

	public List<Compra> getExtratoDeCompras() {
		return extratoDeCompras;
	}

	public void debitaCompra(Compra compra) throws Exception {
		if (compra.getValor() > this.getSaldo()) {
			throw new Exception("Saldo insuficiente! Saldo atual: R$ " + this.getSaldo());
		} else {
			this.saldo -= compra.getValor();
			this.extratoDeCompras.add(compra);
			System.out.println("Compra realizada com sucesso!");
		}

	}

	public void exibeExtratoDeCompras() {
		System.out.println("*********************");
		System.out.println("COMPRAS REALIZADAS:");
		System.out.println();

		Collections.sort(this.getExtratoDeCompras());
		this.getExtratoDeCompras()
				.forEach(compra -> System.out.println(compra.getDescricao() + ": R$ " + compra.getValor()));

		System.out.println();
		System.out.println("*********************");
		System.out.println();
		System.out.println("Saldo do cartão: R$ " + this.getSaldo());
	}
}
