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

public class Carro extends Veiculo {

	private double qtdNoTanque;
	private double rendimentoTotal;

	public void abastecimento(Combustivel comb, double qtd) {
		if (qtdNoTanque + qtd < 50) {
			qtdNoTanque += qtd;
			rendimentoTotal += comb.abastecer(qtd);
		}
	}

	
	/*public Carro(String marca, String cor, String modelo, String anoDeFabrica, int limiteMaximo, Motor motor, Roda roda,
			Transmissao transmissao) {
		super(marca, cor, modelo, anoDeFabrica, limiteMaximo, motor, roda, transmissao);
		// TODO Auto-generated constructor stub
	}*/


	

	@Override
	public boolean acelerar(int qtdParaAcelerar, boolean ligadoDesligado, int velocidadeAtual) {
		int velocidadeDesejada = this.velocidadeAtual + qtdParaAcelerar;
		verificarSeEstaLigado(ligadoDesligado);
		if (ligadoDesligado == true && velocidadeDesejada <= this.velocidadeMaxima && qtdParaAcelerar > 0) {
			this.velocidadeAtual = velocidadeDesejada;
			System.out.println("");
			System.out.println("Acelerando...");
			System.out.println("Velocidade atual " + this.velocidadeAtual + "Km/h");
		} else if (ligadoDesligado == false) {
			System.err.println("Nao eh possivel acelerar, pois o Carro esta desligado");
		} else if (velocidadeDesejada >= this.velocidadeMaxima) {
			this.velocidadeAtual = this.velocidadeMaxima;
			System.err.println("Nao eh possivel acelerar, pois a velocidade maxima é " + this.velocidadeMaxima);
			System.err.println("Velocidade atual " + this.velocidadeMaxima + "Km/h");
		} else {
			System.err.println("A quantidade de voce deseja acelerar nao eh valida");
		}
		return false;
	}

	@Override
	public void frear(int qtdParaFrear, boolean ligadoDesligado, int velocidadeAtual) {
		int velocidadeDesejada = this.velocidadeAtual - qtdParaFrear;
		if (ligadoDesligado == true && velocidadeDesejada > 0 && qtdParaFrear > 0) {
			velocidadeAtual = velocidadeDesejada;
			System.out.println("");
			System.out.println("Freando");
			System.out.println("Velocidade atual " + velocidadeAtual + "Km/h");
		} else if (velocidadeDesejada < 0) {
			System.err.println(
					"Nao eh possivel frear mais, pois a velocidade atual do caro eh " + velocidadeAtual + "Km/h");
		} else if (ligadoDesligado == false) {
			System.err.println("O carro esta desligado");
		} else {
			System.err.println("O valor inserido nao eh valido");
		}

	}

	@Override
	public void mostrarDados() {
		System.out.println("\nExibindo dados do carro: ");
		System.out.println("----------------------------------------------------------");
		System.out.println("\nMarca - " + this.getMarca() + "\nModelo - " + this.getModelo() + "\nCor - "
				+ this.getCor() + "\nAno de fabricacao - " + this.anoDeFabrica + "\nVelocidade maxima - "
				+ this.getLimiteMaximo() + "Km/h" + motor + roda + transmissao);
		System.out.println("\n-----------------------------------------");
	}

	public double getQtdNoTanque() {
		return qtdNoTanque;
	}


	public void setQtdNoTanque(double qtdNoTanque) {
		this.qtdNoTanque = qtdNoTanque;
	}


	public double getRendimentoTotal() {
		return rendimentoTotal;
	}


	public void setRendimentoTotal(double rendimentoTotal) {
		this.rendimentoTotal = rendimentoTotal;
	}


	@Override
	public boolean verificarSeEstaLigado(boolean valor) {
		if (valor == true) {
			return true;
		}
		return false;
	}
	
	// Getters e Setters
	

}
