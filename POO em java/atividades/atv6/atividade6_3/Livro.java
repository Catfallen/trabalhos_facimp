package atividade6_3;

public class Livro extends Midia {
	private int paginas;
	Livro(String titulo,String autor, int ano, int paginas){
		super(titulo,autor,ano);
		this.paginas = paginas;
	}
	@Override
	public void reproduzir() {
		System.out.println("Livro: "+this.titulo);
		System.out.println("Autor: "+this.autor);
		System.out.println("Paginas: "+this.paginas);
		System.out.println("Ano: "+this.ano);
		System.out.println();
	}
}
