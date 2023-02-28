package java_io.src.br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TestaEscrita {

	public static void main(String[] args) throws IOException {

		// Fluxo de saída de arquivo
		OutputStream fos = new FileOutputStream("lorem2.txt");
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);

		bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit.");
		bw.newLine();
		bw.write("kaspewfs safsl qriwpfj");

		bw.close();
	}
}