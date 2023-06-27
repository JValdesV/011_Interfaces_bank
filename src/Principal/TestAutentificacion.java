package Principal;

import Clases.Administrador;
import Clases.Autenticable;
import Clases.Cliente;
import Clases.Gerente;
import Clases.SistemaInterno;

public class TestAutentificacion {

	public static void main(String[] args) {
		
		SistemaInterno si = new SistemaInterno();
		
		Autenticable rf1 = new Gerente();
		Autenticable rf2 = new Cliente();
		Autenticable rf3 = new Administrador();
		
		
		
		rf1.setClave("789");
		si.autentica(rf1);
		
		
		
	}

}
