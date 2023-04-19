package desafios.desafio_ordenar_listas;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {

		Scanner leitor = new Scanner(System.in);

		System.out.println("Digite o limite do cartão:");
		double limite = leitor.nextDouble();
		Cartao meuCartao = new Cartao(limite);

		int opcao = 1;
		while (opcao == 1) {
			System.out.println("Digite a descricao da compra:");
			String descricao = leitor.next();

			System.out.println("Digite o valor da compra:");
			double valorDaCompra = leitor.nextDouble();

			Compra compra = new Compra(descricao, valorDaCompra);

			try {
				meuCartao.debitaCompra(compra);
			} catch (Exception e) {
				System.out.println(e);
			}

			System.out.println("Digite 0 para sair ou 1 para continuar");
			opcao = leitor.nextInt();

		}

		if (opcao == 0) {
			meuCartao.exibeExtratoDeCompras();
		}

		leitor.close();
	}
}
