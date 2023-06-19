package Principal;

import Clases.Funcionario;
import Clases.Gerente;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Funcionario javier = new Funcionario("Javier","700500", 500000);
		System.out.println(javier.toString());
		System.out.println(javier.getBonificacion());
		
		Gerente andres = new Gerente();
		andres.setNombre("Andres");
		andres.setDocumento("123456789");
		andres.setSalario(1000000);
		
		System.out.println(andres.getNombre());
		System.out.println(andres.getDocumento());
		System.out.println(andres.getSalario());
		
		andres.setClave("YHUJ456");
		boolean autenticado = andres.comprobarClave("65654654");
		System.out.println("El usuario está autenticado: "+autenticado);
		
		System.out.println(andres.getBonificacion());
		
		
	}

}
