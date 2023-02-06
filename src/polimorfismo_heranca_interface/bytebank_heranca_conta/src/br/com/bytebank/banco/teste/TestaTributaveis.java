package polimorfismo_heranca_interface.bytebank_heranca_conta.src.br.com.bytebank.banco.teste;

import polimorfismo_heranca_interface.bytebank_heranca_conta.src.br.com.bytebank.banco.modelo.*;

public class TestaTributaveis {

	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente(222, 333);
		cc.deposita(100.00);

		SeguroDeVida seguro = new SeguroDeVida();

		CalculadorDeImposto calc = new CalculadorDeImposto();
		calc.registra(cc);
		calc.registra(seguro);

		System.out.print(calc.getTotalImposto());

	}
}
