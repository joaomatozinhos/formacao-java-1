package polimorfismo_heranca_interface.bytebank_heranca_conta.src.br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

import polimorfismo_heranca_interface.bytebank_heranca_conta.src.br.com.bytebank.banco.modelo.Cliente;
import polimorfismo_heranca_interface.bytebank_heranca_conta.src.br.com.bytebank.banco.modelo.Conta;
import polimorfismo_heranca_interface.bytebank_heranca_conta.src.br.com.bytebank.banco.modelo.ContaCorrente;
import polimorfismo_heranca_interface.bytebank_heranca_conta.src.br.com.bytebank.banco.modelo.ContaPoupanca;
import polimorfismo_heranca_interface.bytebank_heranca_conta.src.br.com.bytebank.banco.modelo.NumeroDaContaComparator;
import polimorfismo_heranca_interface.bytebank_heranca_conta.src.br.com.bytebank.banco.modelo.TitularDaContaComparator;

public class TestaSortCompare {

	public static void main(String[] args) {

		Conta cc1 = new ContaCorrente(22, 33);
		Cliente clienteCC1 = new Cliente();
		clienteCC1.setNome("Nico");
		cc1.setTitular(clienteCC1);

		Conta cc2 = new ContaPoupanca(22, 44);
		Cliente clienteCC2 = new Cliente();
		clienteCC2.setNome("Guilherme");
		cc2.setTitular(clienteCC2);

		Conta cc3 = new ContaCorrente(22, 11);
		Cliente clienteCC3 = new Cliente();
		clienteCC3.setNome("Paulo");
		cc3.setTitular(clienteCC3);

		Conta cc4 = new ContaPoupanca(22, 22);
		Cliente clienteCC4 = new Cliente();
		clienteCC4.setNome("Ana");
		cc4.setTitular(clienteCC4);

		List<Conta> lista = new ArrayList<>();
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);

		for (Conta conta : lista) {
			System.out.println(conta + ", " + conta.getTitular().getNome());
		}

		System.out.println("---------");

		NumeroDaContaComparator numeroComparator = new NumeroDaContaComparator();
		TitularDaContaComparator titularComparator = new TitularDaContaComparator();

		lista.sort(titularComparator);

		for (Conta conta : lista) {
			System.out.println(conta + ", " + conta.getTitular().getNome());
		}

	}

}