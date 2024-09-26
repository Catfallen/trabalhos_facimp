package atividade6_2;

public class Main {
	
	public static void main(String[] args) {
		MeioPeriodo f1 = new MeioPeriodo("Markim",6.42,100);
		System.out.println("Nome: "+f1.nome + " Salario: " +f1.calcularSalario());
		Integral f2 = new Integral("Jullyano",1600,200);
		System.out.println("Nome: "+f2.nome + " Salario: " +f2.calcularSalario());
		Contratado f3 = new Contratado("Yan",2000);
		System.out.println("Nome: "+f3.nome + " Salario: " +f3.calcularSalario());
	}
}
