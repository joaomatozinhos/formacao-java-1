package polimorfismo_heranca_interface.bytebank_heranca_conta.src.br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

import polimorfismo_heranca_interface.bytebank_heranca_conta.src.br.com.bytebank.banco.modelo.Conta;
import polimorfismo_heranca_interface.bytebank_heranca_conta.src.br.com.bytebank.banco.modelo.ContaCorrente;
import polimorfismo_heranca_interface.bytebank_heranca_conta.src.br.com.bytebank.banco.modelo.ContaPoupanca;
import polimorfismo_heranca_interface.bytebank_heranca_conta.src.br.com.bytebank.banco.modelo.NumeroDaContaComparator;

public class TestaSortCompare {

	public static void main(String[] args) {

		Conta cc1 = new ContaCorrente(22, 5863);
		Conta cc2 = new ContaPoupanca(22, 3562);
		Conta cc3 = new ContaCorrente(22, 5756);
		Conta cc4 = new ContaPoupanca(22, 4378);

		List<Conta> lista = new ArrayList<>();
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);

		for (Conta conta : lista) {
			System.out.println(conta);
		}

		System.out.println("---------");

		NumeroDaContaComparator comparator = new NumeroDaContaComparator();

		lista.sort(comparator);

		for (Conta conta : lista) {
			System.out.println(conta);
		}

	}

}