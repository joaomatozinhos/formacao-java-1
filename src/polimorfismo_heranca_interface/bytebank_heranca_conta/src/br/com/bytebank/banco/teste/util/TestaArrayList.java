package polimorfismo_heranca_interface.bytebank_heranca_conta.src.br.com.bytebank.banco.teste.util;

import java.util.ArrayList;

import polimorfismo_heranca_interface.bytebank_heranca_conta.src.br.com.bytebank.banco.modelo.Conta;
import polimorfismo_heranca_interface.bytebank_heranca_conta.src.br.com.bytebank.banco.modelo.ContaCorrente;

public class TestaArrayList {

	public static void main(String[] args) {

		ArrayList lista = new ArrayList();

		Conta cc = new ContaCorrente(22, 1111);
		lista.add(cc);

		Conta cc2 = new ContaCorrente(22, 1112);
		lista.add(cc2);

		System.out.println("Tamanho: " + lista.size());

		Conta ref = (Conta) lista.get(0);

		System.out.println(ref.getNumero());

		lista.remove(0);

		System.out.println("Tamanho: " + lista.size());

		Conta cc3 = new ContaCorrente(33, 2453);
		lista.add(cc3);

		Conta cc4 = new ContaCorrente(33, 7223);
		lista.add(cc4);

		System.out.println("Tamanho: " + lista.size());

		for (int i = 0; i < lista.size(); i++) {
			Object oRef = lista.get(i);
			System.out.println(oRef);
		}

		System.out.println("-------------");

		for (Object oRef : lista) {
			System.out.println(oRef);
		}
	}

}
