package br.com.bytebank.banco.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TesteLambaExercicio {

	public static void main(
			String[] args) {
//		List<String> livros = new ArrayList<String>();
//		
//		livros.add("Eu, Robô");
//		livros.add("Os Irmãos Karamázov");
//		livros.add("Neuromancer");
//		livros.add("Guerra e Paz");
//		livros.add("Anna Kariênina");
//		
//		livros.sort((livro1,livros2)->livro1.compareTo(livros2));
//		
//		livros.forEach((livro)->System.out
//				.println(livro));
		
		List<String> nomes = new ArrayList<>();
		nomes.add("Super Mario");
		nomes.add("Yoshi"); 
		nomes.add("Donkey Kong"); 

		nomes.forEach((nome)->System.out
				.println(nome+"-"+nome.length()));
	
		System.out
				.println("\nTESTE DE ITERATOR");
		Iterator<String> it = nomes.iterator();
		
		while(it.hasNext()) {
			System.out
					.println(it.next());
		}
	}
}
