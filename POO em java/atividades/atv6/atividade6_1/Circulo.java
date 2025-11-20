package atividade6;

public class Circulo extends Forma{
	public Circulo(double raio) {
		super(raio);
	}
	@Override
	public double calcularArea() {
		double raio = this.a;
		return Math.PI*(raio*raio);
	}
	
}
