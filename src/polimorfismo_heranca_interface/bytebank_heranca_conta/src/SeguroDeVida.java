package polimorfismo_heranca_interface.bytebank_heranca_conta.src;

public class SeguroDeVida implements Tributavel {

	@Override
	public double getValorImposto() {
		return 50;
	}

}
