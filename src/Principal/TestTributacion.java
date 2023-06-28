package Principal;

import Clases.CalculadoraDeImpuesto;
import Clases.CuentaCorriente;
import Clases.SeguroDeVida;

public class TestTributacion {

	public static void main(String[] args) {
		
		CuentaCorriente cc = new CuentaCorriente(222, 333);
		cc.deposita(100.0);
		
		SeguroDeVida seguro = new SeguroDeVida();
		
		CalculadoraDeImpuesto cal = new CalculadoraDeImpuesto();
		
		cal.registra(cc);
		cal.registra(seguro);
		
		System.out.println(cal.getTotalImpuesto());
		

	}

}
