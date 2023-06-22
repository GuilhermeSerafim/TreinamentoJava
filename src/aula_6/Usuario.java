package aula_6;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Usuario {

	// Atributos
	private int id;
	private String nome;
	private String email;
	private String telefone;
	private String senha;
	private Date dataCadastro;

	// Construtor
	public Usuario(String nome, String senha) {
		this.nome = nome;
		this.senha = senha;
		this.dataCadastro = new Date(System.currentTimeMillis());
	}

	// Getters e Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public static void main(String[] args) {

		Usuario usuario[] = new Usuario[2];
		usuario[0] = new Usuario("Jose", "root");
		usuario[1] = new Usuario("Maria", "root");

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

		for (int i = 0; i < usuario.length; i++) {
			System.out.println(usuario[i].getNome());
			System.out.println("Data de cadastro: " + dateFormat.format(usuario[i].getDataCadastro()));
			System.out.println("-----------");
			// Por algum motivo meus gets não estão puxando
		}
	}

}
