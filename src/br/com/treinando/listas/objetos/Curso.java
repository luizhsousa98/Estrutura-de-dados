package br.com.treinando.listas.objetos;

import java.util.*;

/**
 * 
 * @author lhsousa- TreeSet so funciona para classes que implementam a interface
 *         Comparable, porque internamente o TreeSet guarda os objetos na sua
 *         ordem natural. Map nao e uma implementação de Collection, ele e uma
 *         interface por si so.
 *
 */
public class Curso {

	private String nome;
	private String instrutor;
	private List<Aula> aulas = new LinkedList<Aula>();
	private Set<Aluno> alunos = new HashSet<>();
	private Set<Aluno> aluno = new LinkedHashSet<>();
	private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();

	public Curso(final String nome, final String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public String getNome() {
		return nome;
	}

	public String getInstrutor() {
		return instrutor;
	}

	/**
	 * Exibir valor de lista de aulas
	 * 
	 * @return - Não permite alteração, só exibe a lista
	 */
	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}

	/**
	 * Realiza a adição de aulas
	 * 
	 * @param aula - adiciona os objeto setados pelo construtor de aulass
	 */
	public void adiciona(final Aula aula) {
		this.aulas.add(aula);
	}

	/**
	 * Realiza a soma do tempo total de aulas. Strem realiza uma manipulação de
	 * coleções de modo eficiente trabalhar com conjuntos de elementos de forma mais
	 * simples e com um numero menor de linhas de codigo.
	 * 
	 * @return - resultado da soma de aulas de todos os cursos
	 */
	public int getTempoTotal() {
		return this.aulas.stream().mapToInt(Aula::getTempo).sum();
	}

	@Override
	public String toString() {
		return "[Curso: " + this.getNome() + ", tempo de total de curso: " + this.getTempoTotal() + ", aulas: + "
				+ this.aulas + "]";
	}

	public void matricula(Aluno aluno) {
		// adiciona no Set de alunos
		this.alunos.add(aluno);
		// cria a relação no Map
		this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
	}

	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}

	/**
	 * Verifica se o aluno esta realmente matriculado
	 * 
	 * @param a1 - objeto aluno
	 * @return - contais se o existe ou nao
	 */
	public boolean estaMatriculado(Aluno a1) {
		return this.alunos.contains(a1);
	}

	public Set<Aluno> getAluno() {
		return Collections.unmodifiableSet(aluno);
	}

	public Aluno buscaMatriculado(int numero) {
		return this.matriculaParaAluno.get(numero);

	}

}
