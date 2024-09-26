package atividade6_2;

public class Funcionario {
	String nome;
	double valorHora;
	int horas;
	double salario;
	Funcionario(String nome, double salario){
		this.nome = nome;
		this.salario = salario;
	}
	public double calcularSalario() {
		return salario;
	}
}
