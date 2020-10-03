package br.com.treinando.listas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestandoListas {

	public static void main(String[] args) {
		/*
		 * Array list ele não tem tamanho certo igual um array pode ser o tamanho que
		 * quiser
		 */

		String aula1 = "Modelando a classe Aula";
		String aula2 = "Conhecendo mais de listas";
		String aula3 = "Trabalhando com cursos e sets";
		// Adicionando conteúdos nas listas
		ArrayList<String> aulas = new ArrayList<String>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);

		System.out.println(aulas);

		// Removendo elementos da lista
		aulas.remove(0);
		System.out.println(aulas);

		aulas.forEach(action -> System.out.println(action));
		// Pegando meu elemento
		for (int i = 0; i < aulas.size(); i++) {
			System.out.println("Aula: " + aulas.get(i));
		}

		// Passando todos as aulas de uma vez
		List<String> aulas2 = Arrays.asList(aula1, aula2, aula3);
		
		//Outra forma de passar todas as aulas de uma vez
		List<String> aulas3 = List.of(aula1, aula2, aula3);
		// Repare que aquiu retorna todas as aulas por serem objetos diferentes
		System.out.println(aulas2);
		System.out.println(aulas3);
		
		boolean ehIgual = aulas.equals(aulas2);
		System.out.println(ehIgual);
		
		//Ordenando as listas
		Collections.sort(aulas2);
		
		System.out.println("Pós ordenação" + aulas2);

	}

}
