package atividade6_2;

public class Contratado extends Funcionario{
	private double taxaContrato;
	Contratado(String nome,double taxaContrato){
		super(nome,taxaContrato);
		this.taxaContrato = taxaContrato;
	}
	@Override
	public double calcularSalario() {
		return taxaContrato;
	}
}

