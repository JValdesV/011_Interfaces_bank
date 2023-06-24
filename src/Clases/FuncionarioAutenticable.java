package Clases;

public class FuncionarioAutenticable {

	private String clave;

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}
	
	public boolean iniciarSesion(String clave) {
		if(clave == this.clave) {
			return true;
		}else {
			return false;
		}
		
	}
	
	
}
