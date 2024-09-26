package atividade6;

public class Triangulo extends Forma{
	double base;
	public Triangulo(double altura,double base) {
		super(altura);
		this.base = base;
	}
	@Override
	public double calcularArea() {
		return (this.a * this.base)/2;
	}
}
