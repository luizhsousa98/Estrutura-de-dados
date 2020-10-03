package br.com.treinando.listas;

import java.util.*;

import br.com.treinando.listas.objetos.Aula;
import br.com.treinando.listas.objetos.Curso;

public class TestaCurso2 {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando coleções", "Luiz Henrique");
		/**
		 * Esse new dentro de add significa que estou inserindo uma nova informação na
		 * minha lista
		 */
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com colecoes", 24));

		/**
		 * A partir desse momento só posso visualizar não inserir novos dados
		 * unmodifiableList
		 */
		List<Aula> aulasImutaveis = javaColecoes.getAulas();
        System.out.println(aulasImutaveis);

        List<Aula> aulas = new ArrayList<>(aulasImutaveis);
		/**
		 * Nos nao podemos ficar invocando metodos que adicionam na lista, que removam
		 * seus itens e nem que mudem de ordem os seus elementos, justamente o que o
		 * sort esta tentando fazer.
		 */
		//aulas.sort(Comparator.comparing(Aula::getTempo));

       // Collections.sort(aulas);
        System.out.println(javaColecoes.getTempoTotal());
        System.out.println("Imprimindo java coleções: " + javaColecoes);
	}

}
