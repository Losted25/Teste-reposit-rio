package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		Gato gato = new Gato();
		Livros livros = new Livros();
		
		System.out.print(gato);
		System.out.print(livros);
		/*int a = 5;
		int b = 12;
		System.out.println("Primeiro programa Java " + (a*b) );*/
	}

}

class Livros{
	private String nome;
	private String npag;
}