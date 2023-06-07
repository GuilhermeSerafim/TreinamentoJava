package aula_1;

import javax.swing.JOptionPane;

public class ExercicioOng {

	public static void main(String[] args) {
		/*
		Scanner entrada = new Scanner(System.in);
		System.out.println("Entre com a doacao");
		float doacao = entrada.nextFloat();
		float investimento;
		
		if (doacao > 1000) {
			investimento = doacao * 0.15f;
		} else {
			 investimento = doacao * 0.05f;
		}
		
		System.out.println("A doacao foi de: " + doacao + " E o investimento foi de: " + investimento);
		
		entrada.close();
		*/
		
		//Com o metodo JOptionPane
		double doacao = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da doacao"));
		double investimento;
		
		if (doacao > 1000) {
			investimento = doacao * 0.15;
		} else {
			 investimento = doacao * 0.05;
		}
		
		JOptionPane.showMessageDialog(null, "Doacao de: " + doacao + " e Investimento de: " + investimento);
		
	}

}
