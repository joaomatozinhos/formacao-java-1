package java_io.src.br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TestaEscritaFileWriter {

	public static void main(String[] args) throws IOException {

		// Fluxo de saída de arquivo
//		OutputStream fos = new FileOutputStream("lorem2.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);

		FileWriter fw = new FileWriter("lorem2.txt");
		BufferedWriter bw = new BufferedWriter(fw);

		bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit.");
		bw.newLine();
		bw.newLine();
		bw.write("kaspewfs safsl qriwpfj");

		bw.close();
	}
}