package br.com.treinando.listas;

import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

import br.com.treinando.listas.objetos.Aluno;
import br.com.treinando.listas.objetos.Aula;
import br.com.treinando.listas.objetos.Curso;

public class TestandoIterator {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 24));

		Set<Aluno> alunos = javaColecoes.getAlunos();

		Iterator<Aluno> iterador = alunos.iterator();
		/**
		 * Metodo hasNext, que devolve um booleano dizendo se ha ou nao um proximo
		 * elemento na colecao. Ja o next, que justamente devolve o proximo elemento.
		 */
		while (iterador.hasNext()) {
			System.out.println(iterador.next());

		}
		/**
		 * Se parece com o ArrayList, inclusive ela implementa List atualmente. A
		 * diferença e que ela pode ser utilizada por varias threads simultaneamente,
		 * chamado de thread safe. Podendo invocar vários metodos add, get, etc, pode
		 * acarretar algo que nao esperamos, como que um "atropele" o outro, elementos
		 * sumirem, exceptions..
		 */
		Vector<Aluno> vetor = new Vector<>();
	}

}
