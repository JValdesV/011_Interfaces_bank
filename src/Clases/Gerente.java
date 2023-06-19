package Clases;

public class Gerente extends Funcionario{
	
	private String clave;

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}
	
	public boolean comprobarClave(String clave) {
		if(clave == this.clave) {
			return true;
		}else {
			return false;
		}
		
	}
	
	//Metodo sobreescrito
	//La misma firma
	
	public double getBonificacion() {
		return super.getSalario();
	}
	
	//Sobrecarga de metodos 
	//Se agregan nuevos parametros
	
	
	
}
