package atividade7;

public abstract class Pagamento {
	double valor;
	int parcelas;
	Pagamento(double valor,int parcelas){
		this.valor = valor;
		this.parcelas = parcelas;
	}
	
	abstract void processarPagamento();
}
