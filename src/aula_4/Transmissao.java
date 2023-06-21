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

public class Transmissao {
	private String tipoCambio, embreagem;

	public Transmissao() {
	}

	public Transmissao(String tipoCambio, String embreagem) {
		this.tipoCambio = tipoCambio;
		this.embreagem = embreagem;
	}

	public String getTipoCambio() {
		return tipoCambio;
	}

	public void setTipoCambio(String tipoCambio) {
		this.tipoCambio = tipoCambio;
	}

	public String getEmbreagem() {
		return embreagem;
	}

	public void setEmbreagem(String embreagem) {
		this.embreagem = embreagem;
	}

	@Override
	public String toString() {
		return "\n\nTransmissao: " + "\nTipo de cambio - "+ tipoCambio + "\nTipo de embreagem - " + embreagem;
	}

	
	
}
