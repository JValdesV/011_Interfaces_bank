package Clases;

public class Gerente extends Autenticable{
	
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

	@Override
	public double getBonificacion() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	//Metodo sobreescrito
	//La misma firma
	/*
	@Override
	public double getBonificacion() {
		return super.getSalario();
	}
	*/
	//Sobrecarga de metodos 
	//Se agregan nuevos parametros
	
	
	
}
