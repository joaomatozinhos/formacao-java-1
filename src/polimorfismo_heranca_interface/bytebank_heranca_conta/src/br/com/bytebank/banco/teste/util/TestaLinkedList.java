package polimorfismo_heranca_interface.bytebank_heranca_conta.src.br.com.bytebank.banco.teste.util;

import java.util.LinkedList;

import polimorfismo_heranca_interface.bytebank_heranca_conta.src.br.com.bytebank.banco.modelo.Conta;
import polimorfismo_heranca_interface.bytebank_heranca_conta.src.br.com.bytebank.banco.modelo.ContaCorrente;

public class TestaLinkedList {

	public static void main(String[] args) {

		LinkedList<Conta> lista = new LinkedList<Conta>();

		Conta cc = new ContaCorrente(22, 1111);
		lista.add(cc);

		Conta cc2 = new ContaCorrente(22, 1112);
		lista.add(cc2);

		lista.remove(0);

		Conta cc3 = new ContaCorrente(33, 2453);
		lista.add(cc3);

		System.out.println("Tamanho: " + lista.size());

		System.out.println(lista.get(1));
	}

}
