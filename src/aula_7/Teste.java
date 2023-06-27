package aula_7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Teste {

	public static void main(String[] args) {
		
		//Objetos tipo Usuario
		Usuario emerson = new Usuario(1, "Emerson", "abc");
		Usuario adriane = new Usuario(2, "Adriane", "abc");
		Usuario maria = new Usuario(3, "Maria", "abc");
		Usuario joao = new Usuario(4, "Joao", "abc");
		Usuario pedro = new Usuario(5, "Pedro", "abc");
		
		//Collection
		List<Usuario> listaUsuarios = new ArrayList<Usuario>();
		
		//Adicionando objetos Usuario a lista de Usuario
		listaUsuarios.add(pedro);
		listaUsuarios.add(joao);
		listaUsuarios.add(maria);
		listaUsuarios.add(adriane);
		listaUsuarios.add(emerson);
		
		//Iterando a lista ordenada
		for(Usuario usuario: listaUsuarios) {
			System.out.println("ID: "+usuario.getIdUsuario() + " - " + usuario.getNome());
		}
		
		//Ordenar a lista conforme regra defina no compareTo
		Collections.sort (listaUsuarios);
		
		System.out.println("--------------------------------");
		
		for(Usuario usuario: listaUsuarios) {
			System.out.println("ID: "+usuario.getIdUsuario() + " - " + usuario.getNome());
		}
		
		Map mapa = new HashMap();
		
		mapa.put("Pedro", pedro);
		
		Object objeto = mapa.get("Pedro");
		Usuario usuario = (Usuario) objeto;
		System.out.println("Objeto chave: " + usuario.getNome());
	}

}
