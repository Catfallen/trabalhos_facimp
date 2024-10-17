package atividade7;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CartaoCredito c1 = new CartaoCredito(1000,2);
		c1.processarPagamento();
		System.out.println();
		Dinheiro d1 = new Dinheiro(1000);
		d1.processarPagamento();
	}

}
