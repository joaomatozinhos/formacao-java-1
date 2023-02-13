package polimorfismo_heranca_interface.bytebank_heranca_conta.src.br.com.bytebank.banco.teste;

import polimorfismo_heranca_interface.bytebank_heranca_conta.src.br.com.bytebank.banco.modelo.Conta;
import polimorfismo_heranca_interface.bytebank_heranca_conta.src.br.com.bytebank.banco.modelo.ContaCorrente;
import polimorfismo_heranca_interface.bytebank_heranca_conta.src.br.com.bytebank.banco.modelo.ContaPoupanca;

public class TestaArrayReferencia {
	public static void main(String[] args) {

		Conta[] contas = new Conta[5];

		ContaCorrente cc1 = new ContaCorrente(4638, 9933);
		contas[0] = cc1;

		ContaPoupanca cp1 = new ContaPoupanca(4638, 9389);
		contas[1] = cp1;

		System.out.println(contas[0].getNumero());

		ContaPoupanca ref = (ContaPoupanca) contas[1];
		System.out.println(ref.getNumero());

	}
}
