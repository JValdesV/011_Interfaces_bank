package Clases;

public class Administrador extends Funcionario implements Autenticable {

	@Override
	public String getClave() {
		return this.getClave();
	}

	@Override
	public void setClave(String clave) {
		this.setClave(clave);
	}

	@Override
	public boolean iniciarSesion(String clave) {
		if(clave == this.getClave()) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public double getBonificacion() {
		return 0.0;
	}

}
