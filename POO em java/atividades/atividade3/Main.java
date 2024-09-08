package atividade3;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		System.out.println("Calculo de salário");
		Scanner sc = new Scanner(System.in);
		String nome;
		double grossSalary,tax;
		
		System.out.print("Nome: ");
		nome = sc.nextLine();
		System.out.print("Salário Bruto: ");
		grossSalary = sc.nextDouble();
		System.out.print("Taxa: ");
		tax = sc.nextDouble();
		
		Banco pessoa1 = new Banco(nome,grossSalary,tax);
		System.out.println("Funcionário: "+pessoa1.getNome()+","+pessoa1.netSalary());
		
		double percentage;
		System.out.print("Qual porcentagem aumentar o salário? ");
		percentage = sc.nextDouble();
		pessoa1.increaseSalary(percentage);
		System.out.println("Dados atualizados: "+pessoa1.getNome()+","+pessoa1.getSalarioBruto());
		sc.close();
	}
}
