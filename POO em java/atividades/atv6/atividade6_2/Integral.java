package atividade6_2;

public class Integral extends Funcionario {
	double bonus;
	Integral(String nome,double salario,double bonus){
		super(nome,salario);
		this.bonus = bonus;
	}
	@Override
	public double calcularSalario() { 
		return this.salario + bonus;
	}
}
