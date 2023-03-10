package java_collections.gerenciador_de_cursos.src.br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestaAlunos {

	public static void main(String[] args) {
		Set<String> alunos = new HashSet<>();
		alunos.add("Rodrigo Turini");
		alunos.add("Alberto Souza");
		alunos.add("Nico Steppat");
		alunos.add("Sergio Lopes");
		alunos.add("Renan Saggio");
		alunos.add("Mauricio Aniche");
		alunos.add("Nico Steppat");

		for (String aluno : alunos) {
			System.out.println(aluno);
		}

		alunos.remove("Sergio Lopes");

		System.out.println(alunos);
		System.out.println(alunos.size());

		boolean pauloEstaMatriculado = alunos.contains("Paulo Silveira");
		System.out.println(pauloEstaMatriculado);

		List<String> alunosEmLista = new ArrayList<>(alunos);
		Collections.sort(alunosEmLista);
		System.out.println(alunosEmLista);
		System.out.println(alunosEmLista.get(2));

	}

}
