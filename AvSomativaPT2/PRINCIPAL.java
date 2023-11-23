package AvSomativaPT2;

public class PRINCIPAL {
	public static void main(String[] args) {
	Produto produto = new Produto("Livro de Romance");
	System.out.println(produto.getNome());
	
	System.out.println("------------");
	
	Livro livro = new Livro("A culpa é das Estrelas","John Green",288);
	System.out.println(livro.getNome());
	System.out.println(livro.getAutor());
	System.out.println(livro.getPaginas());
	
	Livro livro2 = new Livro("É assim que começa","Collen Hoover",336);
	System.out.println(livro2.getNome());
	System.out.println(livro2.getAutor());
	System.out.println(livro2.getPaginas());
	}
}
