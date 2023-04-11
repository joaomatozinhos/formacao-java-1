package desafios.projeto_basico_banco;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		ContaBancaria conta = new ContaBancaria("João Pedro Matozinhos", 5500);

		System.out.println("**************************************");
		System.out.println("Dados iniciais do cliente:");
		System.out.println();
		System.out.println("Nome do cliente: " + conta.getNomeDoTitular());
		System.out.println("Tipo conta: " + conta.getTipoDeConta());
		System.out.println("Saldo inicial: R$" + conta.getSaldo());
		System.out.println("**************************************");

		String menu = """
				
		Operações
		1 - Consultar saldo
		2 - Receber valor
		3 - Transferir valor
		4 - Sair

		Digite a opção desejada:""";

		Scanner leitor = new Scanner(System.in);
		int opcaoSelecionada = 0;

		while (opcaoSelecionada != 4) {
			System.out.print(menu);
			opcaoSelecionada = leitor.nextInt();

			switch (opcaoSelecionada) {
			case 1: {
				conta.consultaSaldo();
				break;
			}
			case 2: {
				System.out.print("Informe o valor a receber: ");
				double valor = leitor.nextDouble();
				conta.recebeValor(valor);
				break;
			}
			case 3: {
				System.out.print("Informe o valor a transferir: ");
				double valor = leitor.nextDouble();

				try {
					conta.transfereValor(valor);
				} catch (Exception e) {
					System.out.println(e);
				}

				break;
			}
			case 4: {
				leitor.close();
				System.out.println("Você saiu do sistema.");
				break;
			}
			default:
				System.out.println("Opção inválida.");
				break;
			}
		}
	}
}
