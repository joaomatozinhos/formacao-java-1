package polimorfismo_heranca_interface.bytebank_heranca.src;

public class Cliente implements Autenticavel {

	private AutenticacaoUtil autenticador;

	public Cliente() {
		this.autenticador = new AutenticacaoUtil();
	}

	@Override
	public void setSenha(String senha) {
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(String senha) {
		return this.autenticador.autentica(senha);
	}
}
