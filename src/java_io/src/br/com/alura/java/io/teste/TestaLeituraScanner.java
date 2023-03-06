package java_io.src.br.com.alura.java.io.teste;

import java.io.File;
import java.util.Scanner;

public class TestaLeituraScanner {

	public static void main(String[] args) throws Exception {

		Scanner scanner = new Scanner(new File("contas.csv"));

		while (scanner.hasNextLine()) {
			String linha = scanner.nextLine();
			System.out.println(linha);
		}

		scanner.close();
	}
}
