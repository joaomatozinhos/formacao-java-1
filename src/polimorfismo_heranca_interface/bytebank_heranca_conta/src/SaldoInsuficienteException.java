package polimorfismo_heranca_interface.bytebank_heranca_conta.src;

public class SaldoInsuficienteException extends RuntimeException {

	public SaldoInsuficienteException(String message) {
		super(message);
	}
}
