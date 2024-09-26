package atividade6_3;

public class Video extends Midia{
	private int duracao;
	private String formato;
	Video(String titulo,String autor,int duracao, int ano,String formato){
		super(titulo,autor,ano);
		this.formato = formato;
		this.duracao = duracao;
	}
	@Override
	public void reproduzir() {
		System.out.println("Video: "+this.titulo);
		System.out.println("Autor: "+this.autor);
		System.out.println("Duração: "+this.duracao+" segundos");
		System.out.println("Ano: "+this.ano);
		System.out.println("Formato: "+this.formato);
		System.out.println();
	}
}
