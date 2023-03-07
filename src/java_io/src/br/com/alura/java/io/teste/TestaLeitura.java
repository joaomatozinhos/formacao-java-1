package java_io.src.br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class TestaLeitura {

	public static void main(String[] args) throws IOException {

		// Fluxo de entrada de arquivo
		InputStream fis = new FileInputStream("lorem.txt");

		// Leitor de fluxo de entrada
		Reader isr = new InputStreamReader(fis, "UTF-8");

		// Leitor de buffer
		BufferedReader br = new BufferedReader(isr);

		String linha = br.readLine();

		while (linha != null) {
			System.out.println(linha);
			linha = br.readLine();
		}

		br.close();
	}
}