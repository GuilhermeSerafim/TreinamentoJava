package aula_4;

/**
 * 
 * @author Felipi 
 * @author Guilherme 
 * @author Ikram
 * @author Isabelle
 * @author Miguel 
 *
 */

public class Motor {
	private String tipoMotor, tipoCombustivel;
	private int qtdLitros, cilindrada, torque;

	public Motor() {
	}

	public Motor(String tipoMotor, String tipoCombustivel, int qtdLitros, int cilindrada, int torque) {
		this.tipoMotor = tipoMotor;
		this.tipoCombustivel = tipoCombustivel;
		this.qtdLitros = qtdLitros;
		this.cilindrada = cilindrada;
		this.torque = torque;
	}
	
	public String getTipoMotor() {
		return tipoMotor;
	}

	public void setTipoMotor(String tipoMotor) {
		this.tipoMotor = tipoMotor;
	}

	public String getTipoCombustivel() {
		return tipoCombustivel;
	}

	public void setTipoCombustivel(String tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}

	public int getQtdLitros() {
		return qtdLitros;
	}

	public void setQtdLitros(int qtdLitros) {
		this.qtdLitros = qtdLitros;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	public int getTorque() {
		return torque;
	}

	public void setTorque(int torque) {
		this.torque = torque;
	}

	@Override
	public String toString() {
		return "\n\nMotor: " + "\nTipo do motor - " + tipoMotor + "\nTipo de combustivel - " + tipoCombustivel 
				+ "\nQuantidade de litros - " + qtdLitros +  "\nCilindrada - " +  cilindrada +  "\nTorque - " + torque;
	}
	
	
}
