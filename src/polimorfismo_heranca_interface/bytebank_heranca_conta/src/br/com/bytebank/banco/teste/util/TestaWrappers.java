package polimorfismo_heranca_interface.bytebank_heranca_conta.src.br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TestaWrappers {

	public static void main(String[] args) {

		int idade = 29;

		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(idade); // autoboxing

		Integer idadeRef = Integer.valueOf(29); // autoboxing
		System.out.println(idadeRef.doubleValue());

		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);

		System.out.println(Integer.SIZE);
		System.out.println(Integer.BYTES);

		int valor = idadeRef.intValue(); // unboxing

		String s = "10";
		int numero = Integer.parseInt(s);
		System.out.println(numero);

		Double dRef = Double.valueOf(3.2);// autoboxing
		System.out.println(dRef.doubleValue());// unboxing

		Boolean bRef = Boolean.FALSE;
		System.out.println(bRef.booleanValue());

		Number refNumero = Integer.valueOf(29);

		List<Number> lista = new ArrayList<>();
		lista.add(10);
		lista.add(32.6);
		lista.add(25.6f);

	}
}