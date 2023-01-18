
public class TestaGetESet {

	public static void main(String[] args) {
		Conta conta = new Conta();
		// conta.numero = 384723; -> isso não funciona
		conta.setNumero(384723);
		System.out.println(conta.getNumero());

		Cliente joao = new Cliente();
		// conta.titular = joao; -> isso não funciona
		joao.setNome("João Pedro Matozinhos");

		conta.setTitular(joao);

		System.out.println(conta.getTitular().getNome());

		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("Software Developer");
		System.out.println(conta.getTitular().getProfissao());

		System.out.println(titularDaConta);
		System.out.println(joao);
		System.out.println(conta.getTitular());
	}

}
