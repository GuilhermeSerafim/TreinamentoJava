package aula_2;

public class Exercicios {

	public static void main(String[] args) {

		// DE 0 A 100
		for (int i = 0; i <= 100; i++) {
			System.out.println(i);
		}

		// DE 100 A 0 - TESTAR
		for (int i = 100; i < 0; i--) {
			System.out.println(i);
		}

		// NUMEROS PARES
		for (int i = 100; i >= 0; i--) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}

		//FATORIAL - fatorial de 5 = 5x4x3x2x1
		int fatorial = 1, valor = 5;

		for (int i = 1; i <= valor; i++) {
			fatorial *= i;
			// fatorial = fatorial * i;
		}
		System.out.println(valor + "! = " + fatorial);

		// NUMEROS SEM SER DO 50 AO 75
		for (int i = 0; i <= 100; i++) {
			if (i >= 50 && i <= 75) {
				continue;
			}
			System.out.println(i);
		}

	}
}
