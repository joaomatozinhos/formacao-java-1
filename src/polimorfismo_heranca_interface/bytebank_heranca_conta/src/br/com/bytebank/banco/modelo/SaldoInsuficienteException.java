package polimorfismo_heranca_interface.bytebank_heranca_conta.src.br.com.bytebank.banco.modelo;

public class SaldoInsuficienteException extends RuntimeException {

	public SaldoInsuficienteException(String message) {
		super(message);
	}
}
