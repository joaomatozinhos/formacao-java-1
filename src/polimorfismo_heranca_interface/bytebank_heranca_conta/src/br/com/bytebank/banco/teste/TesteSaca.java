package polimorfismo_heranca_interface.bytebank_heranca_conta.src.br.com.bytebank.banco.teste;

import polimorfismo_heranca_interface.bytebank_heranca_conta.src.br.com.bytebank.banco.modelo.*;

public class TesteSaca {

	public static void main(String[] args) {
		Conta c = new ContaCorrente(4578, 235799);
		c.deposita(3500);

		// c.saca(1500);
		// c.saca(3499.80);
		try {
			c.saca(4000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

		System.out.println("Saldo: " + c.getSaldo());

	}

}
