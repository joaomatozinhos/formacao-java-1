
public class TestaBanco {

	public static void main(String[] args) {

		Conta contaDoJoao = new Conta();
		// contaDoJoao.titular.nome = "João Pedro Matozinhos";
		// contaDoJoao.titular.cpf = "111.111.111-22";
		// contaDoJoao.titular.profissao = "Software Developer";

		// System.out.println(contaDoJoao.titular.nome);

		Conta contaDaGeane = new Conta();
		// contaDaGeane.titular.nome = "Geane da Conceição";

		// ystem.out.println(contaDaGeane.titular.nome);

		contaDoJoao.deposita(22000);
		contaDoJoao.saca(3460);
		contaDaGeane.deposita(4560);
		System.out.println("Saldo conta do João: R$" + contaDoJoao.getSaldo());
		System.out.println("Saldo conta da Geane: R$" + contaDaGeane.getSaldo());

	}

}
