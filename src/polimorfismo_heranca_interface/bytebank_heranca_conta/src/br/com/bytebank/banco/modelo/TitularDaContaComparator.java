package polimorfismo_heranca_interface.bytebank_heranca_conta.src.br.com.bytebank.banco.modelo;

import java.util.Comparator;

public class TitularDaContaComparator implements Comparator<Conta> {

	@Override
	public int compare(Conta c1, Conta c2) {

		String nomeC1 = c1.getTitular().getNome();
		String nomeC2 = c2.getTitular().getNome();

		return nomeC1.compareTo(nomeC2);
	}

}
