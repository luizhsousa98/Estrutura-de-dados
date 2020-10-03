package br.com.treinando.listas.objetos;

public class Aluno {

	private String nome;
	private int numeroMatricula;
	// LinkedHashSet guarda ordem dos elementos adicionados


	public Aluno(final String nome, final int numeroMatricula) {
		// Se o nome for nulo vai dar erro
		if (nome == null) {
			throw new NullPointerException("Nome não pode ser nulo");
		}

		this.nome = nome;
		this.numeroMatricula = numeroMatricula;
	}

	public String getNome() {
		return nome;
	}

	public int getNumeroMatricula() {
		return numeroMatricula;
	}

	@Override
	public String toString() {
		return "[Aluno: " + this.nome + ", matricula: " + this.numeroMatricula + "]";
	}

	/**
	 * Converter a classe aluno e comparando o objeto nome
	 * 
	 * @param - O objeto generico.
	 * @return - nome e igual ao objeto outronome
	 */
	@Override
	public boolean equals(Object obj) {
		Aluno outroAluno = (Aluno) obj;
		return this.nome.equals(outroAluno.nome);
	}

	/**
	 * Utilizando o metodo hashCode, por isso precisamos sobrescreve-lo, mudando-o
	 * para quando criarmos um objeto Aluno com o mesmo nome, que esses objetos
	 * gerem o mesmo hashCode e portanto, fiquem no mesmo grupo.
	 */
	@Override
	public int hashCode() {
		return this.nome.hashCode();
	}

}
