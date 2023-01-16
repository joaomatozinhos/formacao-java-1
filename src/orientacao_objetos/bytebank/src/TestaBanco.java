
public class TestaBanco {

	public static void main(String[] args) {
		Cliente joao = new Cliente();
		joao.nome = "João Pedro Matozinhos";
		joao.cpf = "111.111.111-22";
		joao.profissao = "Software Developer";
		
		Conta contaDoJoao = new Conta();
		contaDoJoao.titular = joao;
		
		System.out.println(contaDoJoao.titular.nome);
		
		Conta contaDaGeane = new Conta();
		contaDaGeane.titular = new Cliente();
		contaDaGeane.titular.nome = "Geane da Conceição";
		
		System.out.println(contaDaGeane.titular.nome);

	}

}
