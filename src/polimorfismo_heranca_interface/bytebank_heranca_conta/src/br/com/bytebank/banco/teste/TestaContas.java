package polimorfismo_heranca_interface.bytebank_heranca_conta.src.br.com.bytebank.banco.teste;

import polimorfismo_heranca_interface.bytebank_heranca_conta.src.br.com.bytebank.banco.modelo.ContaCorrente;
import polimorfismo_heranca_interface.bytebank_heranca_conta.src.br.com.bytebank.banco.modelo.ContaPoupanca;

public class TestaContas {

	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente(9887, 457120);
		cc.deposita(5780.00);
		System.out.println("Saldo CC: " + cc.getSaldo());

		ContaPoupanca cp = new ContaPoupanca(7851, 698754);
		cp.deposita(3240.45);
		System.out.println("Saldo CP: " + cp.getSaldo());

		cc.transfere(2000.00, cp);
		System.out.println("Saldo CC: " + cc.getSaldo());
		System.out.println("Saldo CP: " + cp.getSaldo());

		cc.saca(100.00);

	}

}