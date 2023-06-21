package aula_4;

public class Alcool implements Combustivel {

	@Override
	public double abastecer(double qtd) {
		
		return qtd * 7.5;
	}
	
	
}
