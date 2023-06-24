package Principal;

import Clases.Contador;

public class TestFuncionario {

	public static void main(String[] args) {
		
		Contador javier = new Contador();
		javier.setNombre("Javier");
		javier.setDocumento("700500");
		javier.setSalario(500000);
		
		System.out.println(javier.toString());
		System.out.println(javier.getBonificacion());

	}

}
