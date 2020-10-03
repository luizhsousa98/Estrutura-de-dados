package br.com.treinando.listas.objetos;

public class Aula {

	private String titulo;
	private int tempo;

	public Aula(String titulo, int tempo) {
		this.titulo = titulo;
		this.tempo = tempo;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getTempo() {
		return tempo;
	}
	
	public int compareTo(final Aula outraAula) {
		return this.titulo.compareTo(outraAula.getTitulo());
	}

	@Override
	public String toString() {
		return "[Aula: " + getTitulo() + " - Tempo: " + getTempo() + "]";
	}

}
