package atividade3;
public class Banco {
	private String nome;
	private double salarioBruto;
	private	double tax;
	
	Banco(String name,double grossSalary,double tax){
		this.nome = name;
		this.salarioBruto = grossSalary;
		this.tax = tax;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setSalarioBruto(double salario) {
		this.salarioBruto = salario;
	}
	
	public void setTax(double tax) {
		this.tax = tax;
	}
	
	public String getNome() {
		return this.nome;
	}

	public double getSalarioBruto() {
		return this.salarioBruto;
	}
	
	public double getTax() {
		return this.tax;
	}
	
	public double netSalary() {
		return this.getSalarioBruto()-this.getTax();
	}
	
	public void increaseSalary(double percentage ) {
		double increase = (this.getSalarioBruto()*(percentage/100));
		this.setSalarioBruto(this.netSalary()+increase);
	}


}



