package Clases;

public class CuentaCorriente extends Cuenta implements Tributacion{
	
	public CuentaCorriente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	
	@Override
	public void saca(double valor) {
		double valorARetirar = valor + 0.2;
		super.saca(valorARetirar);
	}


	@Override
	public void deposita(double valor) {
		this.saldo += valor;			
	}


	@Override
	public double getValorImpuesto() {
		return super.saldo * 0.01;
	}
	
	
	
	
	
	
}
