package br.com.treinando.listas;

import java.util.List;

import br.com.treinando.listas.objetos.Aula;
import br.com.treinando.listas.objetos.Curso;

public class TestaCurso {

	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Java Coleções", "Luiz Henrique");
		
		List<Aula> aulas = javaColecoes.getAulas();
		System.out.println(aulas);
		
		javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 21));		
		System.out.println(aulas);
		
		javaColecoes.adiciona(new Aula("Java 8", 20));
		javaColecoes.adiciona(new Aula("Spring MVC", 40));
		javaColecoes.adiciona(new Aula("EJB", 45));
		
		System.out.println(javaColecoes.getAulas());
		
		// tentando adicionar da maneira "antiga". Não podemos fazer isso por causa do 
        javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 21));
        System.out.println(javaColecoes.getAulas());
	}

}
