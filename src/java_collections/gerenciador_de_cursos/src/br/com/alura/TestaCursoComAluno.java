package java_collections.gerenciador_de_cursos.src.br.com.alura;

public class TestaCursoComAluno {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 24));

		Aluno a1 = new Aluno("Rodrigo Turini", 34672);
		Aluno a2 = new Aluno("Mauricio Aniche", 17645);
		Aluno a3 = new Aluno("Guilherme Silveira", 5617);

		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);

		System.out.println("Todos os alunos matriculados: ");
		javaColecoes.getAlunos().forEach(aluno -> System.out.println(aluno));

		System.out.print("O aluno " + a1.getNome() + " está matriculado? ");
		System.out.println(javaColecoes.estaMatriculado(a1));

		Aluno turini = new Aluno("Rodrigo Turini", 34672);
		System.out.print("E esse Turini, está matriculado? ");
		System.out.println(javaColecoes.estaMatriculado(turini));

		System.out.print("O a1 é equals ao Turini? ");
		System.out.println(a1.equals(turini));

		System.out.println(a1.hashCode() == turini.hashCode());

	}
}
