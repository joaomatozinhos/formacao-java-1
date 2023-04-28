package desafios.consulta_api_cep;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner leitura = new Scanner(System.in);
		String busca = "";

		List<Endereco> listaDeEndereco = new ArrayList<>();

		while (!busca.equals("sair")) {
			System.out.print("Digite o CEP que deseja pesquisar: ");
			busca = leitura.nextLine();

			if (busca.equals("sair")) {
				GeradorDeArquivo geradorDeArquivo = new GeradorDeArquivo();
				geradorDeArquivo.salvaJson(listaDeEndereco);

				System.out.println("Aplicação finalizada.");
				leitura.close();
				break;
			}

			ConsultaCep consultaCep = new ConsultaCep();

			try {
				Endereco endereco = consultaCep.buscaEndereco(busca);
				listaDeEndereco.add(endereco);
				System.out.println(endereco);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}

}
