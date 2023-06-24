package Principal;

import Clases.Administrador;
import Clases.Gerente;
import Clases.SistemaInterno;

public class TestSistemaInterno {

	public static void main(String[] args) {
		
		SistemaInterno sistema = new SistemaInterno();
		
		Gerente gerente1 = new Gerente();
		Administrador admin = new Administrador();
		
		gerente1.setClave("12345");
		sistema.autentica(gerente1);
		
		admin.setClave("12345");
		sistema.autentica(admin);
		
		
		
	}

}
