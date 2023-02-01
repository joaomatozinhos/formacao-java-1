package polimorfismo_heranca_interface.bytebank_heranca.src;

public class Gerente extends Funcionario implements Autenticavel {

	private AutenticacaoUtil autenticador;

	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}

	public double getBonificacao() {
		System.out.println("Executando o método getBonificacao da classe Gerente");
		return super.getSalario();
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
