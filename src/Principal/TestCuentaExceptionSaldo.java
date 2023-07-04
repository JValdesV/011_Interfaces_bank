package Principal;

import Clases.Cuenta;
import Clases.CuentaAhorro;

public class TestCuentaExceptionSaldo {

	public static void main(String[] args) {
		//Aqui vamosa testear la excepcion de tipo saldoinsuficiente
		
		Cuenta cuenta = new CuentaAhorro(123, 456);
		cuenta.deposita(100);
		cuenta.saca(200);

	}

}
