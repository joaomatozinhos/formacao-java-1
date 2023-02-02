package polimorfismo_heranca_interface.bytebank_heranca.src;

public interface Autenticavel {

	public abstract void setSenha(String senha);

	public abstract boolean autentica(String senha);

}
