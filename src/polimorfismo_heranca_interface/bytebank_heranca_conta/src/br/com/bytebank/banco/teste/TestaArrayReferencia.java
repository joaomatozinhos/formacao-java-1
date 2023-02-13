package polimorfismo_heranca_interface.bytebank_heranca_conta.src.br.com.bytebank.banco.teste;

import polimorfismo_heranca_interface.bytebank_heranca_conta.src.br.com.bytebank.banco.modelo.ContaCorrente;

public class TestaArrayReferencia {
	public static void main(String[] args) {

		ContaCorrente[] contas = new ContaCorrente[5];
		ContaCorrente cc1 = new ContaCorrente(4638, 9933);
		contas[0] = cc1;

		ContaCorrente cc2 = new ContaCorrente(4638, 9389);
		contas[1] = cc2;

		System.out.println(contas[0].getNumero());

		int[] refs = { 1, 2, 3, 4, 5 };
		System.out.println(refs[3]);

	}
}
