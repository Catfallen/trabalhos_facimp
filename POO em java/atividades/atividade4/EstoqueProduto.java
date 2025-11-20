package atividade4;
public class EstoqueProduto {
	private String descricao;
	private int quantidade;
	private double valor;
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getDescricao() {
		return this.descricao;
	}
	
	public void setQuantidade(int q) {
		this.quantidade = q;
	}
	public int getQuantidade() {
		return this.quantidade;
	}
	
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public void cadastrar(String d, int q, double v) {
		this.descricao = d;
		this.quantidade = q;
		this.valor = v; 
	}
	
	public void removerQuantidade(int q) {
		this.quantidade -= q;
	}
	
	public void exibirEstoque() {
		System.out.println("Produto");
		System.out.println("Descrição: "+this.descricao);
		System.out.println("Quantidade: "+this.quantidade);
		System.out.println("Valor: "+this.valor);
	}
	
	
	
	
	
	
	
	
}
