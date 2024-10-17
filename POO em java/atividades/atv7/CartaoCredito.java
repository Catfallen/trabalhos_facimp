package atividade7;

public class CartaoCredito extends Pagamento {
	CartaoCredito(double valor, int parcelas) {
		super(valor, parcelas);
		// TODO Auto-generated constructor stub
	}
	
	double valorParcelas() {
		return valor/parcelas;
	}
	
	@Override
	void processarPagamento() {
		//System.out.println("Pagamento de "+this.valor+" parcelado em "+this.parcelas);
		System.out.println("Valor total: "+this.valor);
		System.out.println("Parcelas: "+this.parcelas);
		System.out.println("Valor das parcelas: "+this.valorParcelas());
	}
}
