package aula_1;

import java.util.Scanner;

public class ExercicioOng2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Entre com a idade");
		int idade = entrada.nextInt();
		if (idade < 16) {
			System.out.println("Nao pode votar e nem embarcar");
		} else if(idade >= 16 && idade < 18) {
			System.out.println("Podem optar por votar ou não");
		} else {
			System.out.println("Voto obrigatorio");
		}
		
		entrada.close();
	}

}
