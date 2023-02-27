package polimorfismo_heranca_interface.bytebank_heranca_conta.src.br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import polimorfismo_heranca_interface.bytebank_heranca_conta.src.br.com.bytebank.banco.modelo.Cliente;
import polimorfismo_heranca_interface.bytebank_heranca_conta.src.br.com.bytebank.banco.modelo.Conta;
import polimorfismo_heranca_interface.bytebank_heranca_conta.src.br.com.bytebank.banco.modelo.ContaCorrente;
import polimorfismo_heranca_interface.bytebank_heranca_conta.src.br.com.bytebank.banco.modelo.ContaPoupanca;

public class TestaLambda {

	public static void main(String[] args) {

		Conta cc1 = new ContaCorrente(22, 33);
		Cliente clienteCC1 = new Cliente();
		clienteCC1.setNome("Nico");
		cc1.setTitular(clienteCC1);
		cc1.deposita(7457.00);

		Conta cc2 = new ContaPoupanca(22, 44);
		Cliente clienteCC2 = new Cliente();
		clienteCC2.setNome("Guilherme");
		cc2.setTitular(clienteCC2);
		cc2.deposita(5493.00);

		Conta cc3 = new ContaCorrente(22, 11);
		Cliente clienteCC3 = new Cliente();
		clienteCC3.setNome("Paulo");
		cc3.setTitular(clienteCC3);
		cc3.deposita(8567.00);

		Conta cc4 = new ContaPoupanca(22, 22);
		Cliente clienteCC4 = new Cliente();
		clienteCC4.setNome("Ana");
		cc4.setTitular(clienteCC4);
		cc4.deposita(6282.00);

		List<Conta> lista = new ArrayList<>();
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);

		// Ordena de acordo com o número da conta
		// lista.sort((Conta c1, Conta c2) -> Integer.compare(c1.getNumero(),
		// c2.getNumero()));

		// Ordena de acordo com o nome do titular da conta
		Comparator<Conta> comp = (Conta c1, Conta c2) -> {

			String nomeC1 = c1.getTitular().getNome();
			String nomeC2 = c2.getTitular().getNome();

			return nomeC1.compareTo(nomeC2);

		};
		lista.sort(comp);

		lista.forEach((conta) -> System.out.println(conta + ", " + conta.getTitular().getNome()));
	}

}