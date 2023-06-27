package aula_7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class ArrayListVSLinkedListPerfomance {

	public static void main(String[] args) {
									//Ou Linked List
		Collection<Long> lista = new ArrayList<Long>();
									//O Array é mais perfomático, mas ocupa mais espaço
		
		long inicio = System.currentTimeMillis();

		for (long i = 0; i <= 500000; i++) {
			lista.add(i);
		}

		long fim = System.currentTimeMillis();

		long tempoGasto = fim - inicio;
		
		System.out.println(tempoGasto);
	}

}
