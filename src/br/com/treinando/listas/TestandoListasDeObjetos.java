package br.com.treinando.listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.treinando.listas.objetos.Aula;

public class TestandoListasDeObjetos {
	public static void main(String[] args) {

		Aula a1 = new Aula("Revistando as ArraysLists", 21);
		Aula a2 = new Aula("Listas de objetos", 20);
		Aula a3 = new Aula("Relacionamento de listas e objetos", 15);

		ArrayList<Aula> aulas = new ArrayList<>();
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		
		//Collections não sabe ordenar uma lista de objetos
		aulas.forEach(aula -> System.out.println(aula));
		
		String s1 = "Luiz";
		String s2 = "Henrique";
		
		//compareTo é int
		int resultado = s1.compareTo(s2);
		
		System.out.println(resultado);
		//Ordenando por ordem menor tempo para o maior
		Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
		
		System.out.println(aulas);
		
		//Comparando aulas
		aulas.sort(Comparator.comparing(Aula::getTempo));
		
		System.out.println("Comparando objetos => " + aulas);
	}
}
