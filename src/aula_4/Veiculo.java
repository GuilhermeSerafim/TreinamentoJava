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

public abstract class Veiculo {
	protected String marca;
	protected String cor;
	protected String modelo;
	protected String anoDeFabrica;
	protected String tipoDeCombustivel;
	protected int velocidadeAtual;
	protected int velocidadeMaxima;
	protected Motor motor;
	protected Roda roda;
	protected Transmissao transmissao;

	// Construtor
	public Veiculo(String marca, String cor, String modelo, String anoDeFabrica, int limiteMaximo, Motor motor,
			Roda roda, Transmissao transmissao) {
		this.marca = marca;
		this.cor = cor;
		this.modelo = modelo;
		this.anoDeFabrica = anoDeFabrica;
		this.velocidadeMaxima = limiteMaximo;
		this.motor = motor;
		this.roda = roda;
		this.transmissao = transmissao;
	}
	
	public Veiculo() {
		
	}

	// Getters e Setters
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getAnoDeFabrica() {
		return anoDeFabrica;
	}

	public void setAnoDeFabrica(String anoDeFabrica) {
		this.anoDeFabrica = anoDeFabrica;
	}

	public String getTipoDeCombustivel() {
		return tipoDeCombustivel;
	}

	public void setTipoDeCombustivel(String tipoDeCombustivel) {
		this.tipoDeCombustivel = tipoDeCombustivel;
	}

	public int getVelocidadeAtual() {
		return velocidadeAtual;
	}

	public void setVelocidadeAtual(int velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}

	public int getLimiteMaximo() {
		return velocidadeMaxima;
	}

	public void setLimiteMaximo(int limiteMaximo) {
		this.velocidadeMaxima = limiteMaximo;
	}

	// Métodos abstratos
	public abstract boolean acelerar(int qtdParaAcelerar, boolean ligadoDesligado, int velocidadeAtual);

	public abstract boolean verificarSeEstaLigado(boolean valor);

	public abstract void frear(int qtdParaFrear, boolean ligadoDesligado, int velocidadeAtual);

	public abstract void mostrarDados();

}
