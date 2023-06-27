package aula_7;

import java.util.ArrayList;
import java.util.List;

public class Teste {

	public static void main(String[] args) {
		
		//Objetos tipo Usuario
		Usuario emerson = new Usuario(1, "Emerson", "abc");
		Usuario adriane = new Usuario(1, "Adriane", "abc");
		Usuario maria = new Usuario(1, "Maria", "abc");
		Usuario joao = new Usuario(1, "Joao", "abc");
		Usuario pedro = new Usuario(1, "Pedro", "abc");
		
		//Collection
		List<Usuario> listaUsuarios = new ArrayList<Usuario>();
		
		//Adicionando objetos Usuario a lista de Usuario
		listaUsuarios.add(pedro);
		listaUsuarios.add(joao);
		listaUsuarios.add(maria);
		listaUsuarios.add(adriane);
		listaUsuarios.add(emerson);
		
		for(Usuario usuario: listaUsuarios) {
			System.out.println(usuario.getNome());
		}
	}

}
