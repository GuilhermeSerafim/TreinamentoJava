package aula_6;

public class VetoresForeach {

	public static void main(String[] args) {
		int[] numeros = new int[10];
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = i * 2;
		}
		
		// Foreach
		for (int numero: numeros) {
			System.out.println(numero+"\t");
		
		}
	}
}