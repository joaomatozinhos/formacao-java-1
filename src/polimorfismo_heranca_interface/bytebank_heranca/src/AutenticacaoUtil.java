package polimorfismo_heranca_interface.bytebank_heranca.src;

public class AutenticacaoUtil {

	private String senha;

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public boolean autentica(String senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}

	}
}
