package java_io.src.br.com.alura.java.io.teste;

import java.io.IOException;
import java.io.PrintWriter;

public class TestaEscritaPrintStreamEPrintWriter {

	public static void main(String[] args) throws IOException {

		// PrintStream ps = new PrintStream("lorem2.txt");
		PrintWriter ps = new PrintWriter("lorem2.txt");

		ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		ps.println();
		ps.println("aygndfnsç dfs sdf asf assdß");

		ps.close();

	}
}
