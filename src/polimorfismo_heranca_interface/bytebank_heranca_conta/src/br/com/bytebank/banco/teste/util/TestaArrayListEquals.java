package polimorfismo_heranca_interface.bytebank_heranca_conta.src.br.com.bytebank.banco.teste.util;

import java.util.ArrayList;

import polimorfismo_heranca_interface.bytebank_heranca_conta.src.br.com.bytebank.banco.modelo.Conta;
import polimorfismo_heranca_interface.bytebank_heranca_conta.src.br.com.bytebank.banco.modelo.ContaCorrente;

public class TestaArrayListEquals {

	public static void main(String[] args) {

		ArrayList<Conta> lista = new ArrayList<Conta>();

		Conta cc = new ContaCorrente(22, 1111);
		lista.add(cc);

		Conta cc2 = new ContaCorrente(22, 1112);
		lista.add(cc2);

		Conta cc3 = new ContaCorrente(22, 1112);

		boolean existe = lista.contains(cc3);
		System.out.println("Já existe? " + existe);
	}

}