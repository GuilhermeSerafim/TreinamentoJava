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

public class Roda {
	
	//Atributos
	private String cor, marca;
	private double pesoSuportado, larguraRodaDianteira, larguraRodaTraseira;
	private int qntdRodas;
	
	//Construtor vazio
	public Roda() {
		
	}
	
	//Construtor
		public Roda(String cor, String marca, double pesoSuportado, int qntdRodas, double larguraRodaDianteira, double larguraRodaTraseira) {
			this.cor = cor;
			this.marca = marca;
			this.pesoSuportado = pesoSuportado;
			this.qntdRodas = qntdRodas;
			this.larguraRodaDianteira = larguraRodaDianteira;
			this.larguraRodaTraseira = larguraRodaTraseira;
		}

	//Getters/setters
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPesoSuportado() {
		return pesoSuportado;
	}

	public void setPesoSuportado(double pesoSuportado) {
		this.pesoSuportado = pesoSuportado;
	}

	public int getQntdRodas() {
		return qntdRodas;
	}

	public void setQntdRodas(int qntdRodas) {
		this.qntdRodas = qntdRodas;
	}

	public double getRodaDianteira() {
		return larguraRodaDianteira;
	}

	public void setRodaDianteira(double larguraRodaDianteira) {
		this.larguraRodaDianteira = larguraRodaDianteira;
	}

	public double getRodaTraseira() {
		return larguraRodaTraseira;
	}

	public void setRodaTraseira(double larguraRodaTraseira) {
		this.larguraRodaTraseira = larguraRodaTraseira;
	}

	@Override
	public String toString() {
		return "\n\nRoda: " + "\nCor - " + cor + "\nMarca - " + marca + "\nPeso suportado - " + pesoSuportado + "\nQuantidade de rodas - " + qntdRodas + "\nLargura da roda dianteira - " + larguraRodaDianteira + "\nLargura da roda traseira - " + larguraRodaTraseira;
	}

	
	
}
