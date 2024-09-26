package atividade6_2;

public class MeioPeriodo  extends Funcionario{
	private int horasTrabalhadas;
	private  double valorHora;
	MeioPeriodo(String nome,double valorHora,int horasTrabalhadas){
		super(nome,valorHora*horasTrabalhadas);
		this.horasTrabalhadas = horasTrabalhadas;
		this.valorHora = valorHora;
	}
	@Override
	public double calcularSalario() {
		return this.horasTrabalhadas * this.valorHora; 
	}
}
