
public class TestaGetESet {

	public static void main(String[] args) {
		Conta conta = new Conta();
		// conta.numero = 384723 -> isso não funciona
		conta.setNumero(384723);
		System.out.println(conta.getNumero());

	}

}
