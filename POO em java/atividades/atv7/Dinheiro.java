package atividade7;

public class Dinheiro extends Pagamento {

	Dinheiro(double valor) {
		super(valor,1);
		// TODO Auto-generated constructor stub
	}

	@Override
	void processarPagamento() {
		// TODO Auto-generated method stub
		System.out.println("Valor pago em dinheiro: "+this.valor);
	}
	
}
