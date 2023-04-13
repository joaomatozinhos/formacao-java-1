package desafios.desafio_heranca_polimorfismo.br.com.alura.minhasmusicas.modelos;

public class Audio {

	private String titulo;
	private int totalDeReproducoes;
	private int totalDeCurtidas;
	private double classificacao;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getTotalDeReproducoes() {
		return totalDeReproducoes;
	}

	public int getCurtidas() {
		return totalDeCurtidas;
	}

	public double getClassificacao() {
		return classificacao;
	}
	
	public void curte() {
		this.totalDeCurtidas++;
	}
	
	public void reproduz() {
		this.totalDeReproducoes++;
	}
}
