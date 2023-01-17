
public class TestaBanco {

	public static void main(String[] args) {
		
		Conta contaDoJoao = new Conta();
		contaDoJoao.titular.nome = "João Pedro Matozinhos";
		contaDoJoao.titular.cpf = "111.111.111-22";
		contaDoJoao.titular.profissao = "Software Developer";
		
		System.out.println(contaDoJoao.titular.nome);
		
		Conta contaDaGeane = new Conta();
		contaDaGeane.titular.nome = "Geane da Conceição";
		
		System.out.println(contaDaGeane.titular.nome);

	}

}
