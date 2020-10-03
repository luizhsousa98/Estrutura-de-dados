package br.com.treinando.listas;

import br.com.treinando.listas.objetos.Aluno;
import br.com.treinando.listas.objetos.Aula;
import br.com.treinando.listas.objetos.Curso;
import java.util.*;

/**
 * Mas temos outras como o LinkedHashMap, bastante parecido com o LinkedHashSet,
 * que guarda a ordem de inserçao. Ou seja, se fossemos imprimir o
 * LinkedHashMap, a impressao apareceria na ordem em que foi inserida.
 * 
 * @author lhsousa
 *
 */
public class TestaBuscaAlunosNoCurso {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 24));

		Aluno a1 = new Aluno("Rodrigo Turini", 34672);
		Aluno a2 = new Aluno("Guilherme Silveira", 5617);
		Aluno a3 = new Aluno("Mauricio Aniche", 17645);

		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);

		System.out.println("Quem é o aluno com matricula 5617?");
		Aluno aluno = javaColecoes.buscaMatriculado(5617);
		System.out.println("Aluno: " + aluno);

	}

}
