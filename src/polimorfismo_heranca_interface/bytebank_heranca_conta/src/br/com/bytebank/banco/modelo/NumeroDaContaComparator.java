package polimorfismo_heranca_interface.bytebank_heranca_conta.src.br.com.bytebank.banco.modelo;

import java.util.Comparator;

public class NumeroDaContaComparator implements Comparator<Conta> {

	@Override
	public int compare(Conta c1, Conta c2) {

		return Integer.compare(c1.getNumero(), c2.getNumero());
	}

}
