package atividade6;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangulo t1 = new Triangulo(9,5);
		Circulo c1 = new Circulo(4);
		Quadrado q1 = new Quadrado(4);
		System.out.println(c1.calcularArea());
		System.out.println(t1.calcularArea());
		System.out.println(q1.calcularArea());
	}

}
