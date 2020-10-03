package br.com.treinando.listas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestaAlunos {
	public static void main(String[] args) {

		/**
		 * Set e List sao interfaces, Set ele nao sabe em que ordem eles estao, como nao
		 * temos garantia da ordem dos elementos, nao podemos invocar o get pedindo o
		 * quarto elemento, ja que como nao existe ordem, nao existe esse quarto
		 * elemento.
		 * 
		 * HashSet - Nao aceita elementos repetidos
		 * 
		 * Todos os Sets do Java garantem para nos que so havera um objeto dentro do
		 * conjunto, nenhum outro igual. Ele ignorara todos os outros elementos iguais
		 */
		Set<String> alunos = new HashSet<>();
		alunos.add("Rodrigo");
		alunos.add("Alberto");
		alunos.add("Juca");
		alunos.add("Andressa");
		alunos.add("Marina");
		alunos.add("Paula");
		alunos.add("Paulo");
		alunos.add("Luiz");
		alunos.add("Luiz");


		alunos.forEach(aluno -> System.out.println(aluno));

		System.out.println(alunos);
		
		boolean pauloEstaMatriculado = alunos.contains("Paulo");
		
		System.out.println(pauloEstaMatriculado);
		
		System.out.println("Testando com a interface genérica Collection");
		//HashSet implementa Set que implementa Collection
		Collection<String> alunos1 = new HashSet<>();
		alunos1.add("Alberto");
		alunos1.add("Juca");
		alunos1.add("Andressa");
		alunos1.add("Marina");
		
		System.out.println(alunos1);
		
		System.out.println("Testando lista com o objeto de alunos da Set");
		List<String> alunosEmLista = new ArrayList<>(alunos);
		alunosEmLista.add("LH");
		
		System.out.println(alunosEmLista);
	}
}
